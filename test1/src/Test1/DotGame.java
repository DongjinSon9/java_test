package Test1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DotGame extends JFrame {
	private ArrayList<Point> leftDots, rightDots;
	private ArrayList<Line> lines;
	private JButton startButton, resetButton;
	private JLabel timerLabel;
	private long startTime;
	private Timer timer;
	private boolean gameStarted;
	private Point selectedDot;

	public DotGame() {
		setTitle("Dot Connecting Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// 점 초기화
		initializeDots();

		// 선 초기화
		lines = new ArrayList<>();

		// 버튼
		startButton = new JButton("Start");
		resetButton = new JButton("Reset");

		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startGame();
			}
		});

		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetGame();
			}
		});

		// 타이머 라벨
		timerLabel = new JLabel("Time: 0 seconds");

		// 게임 판넬
		JPanel gamePanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				drawDots(g);
				drawLines(g);
			}
		};
		gamePanel.setPreferredSize(new Dimension(600, 400));
		gamePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (gameStarted) {
					Point clickPoint = e.getPoint();
					connectDots(clickPoint);
				}
			}
		});

		// 조작 판넬
		JPanel controlPanel = new JPanel();
		controlPanel.add(startButton);
		controlPanel.add(resetButton);
		controlPanel.add(timerLabel);

		add(gamePanel, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void initializeDots() {
		leftDots = new ArrayList<>();
		rightDots = new ArrayList<>();

		// 왼쪽 점
		for (int i = 0; i < 10; i++) {
			int x = 100; // x-coordinate for left dots
			int y = 50 + i * 30; // y-coordinate for left dots
			leftDots.add(new Point(x, y));
		}

		// 오른쪽 점
		for (int i = 0; i < 10; i++) {
			int x = 400; // x-coordinate for right dots
			int y = 50 + i * 30; // y-coordinate for right dots
			rightDots.add(new Point(x, y));
		}

		// 오른쪽 랜덤 배치
		Collections.shuffle(rightDots);

		// 왼쪽 랜덤 배치
		Collections.shuffle(leftDots);
	}

	private void drawDots(Graphics g) {
		g.setColor(Color.RED); // 점 색깔

		// 왼쪽 점 표시
		for (int i = 0; i < leftDots.size(); i++) {
			Point leftDot = leftDots.get(i);
			g.fillOval(leftDot.x - 5, leftDot.y - 5, 10, 10); // Draw circle centered on the dot's coordinates
			g.drawString(Integer.toString(i + 1), leftDot.x - 5, leftDot.y - 5);
		}

		// 오른쪽 점 표시
		for (int i = 0; i < rightDots.size(); i++) {
			Point rightDot = rightDots.get(i);
			g.fillOval(rightDot.x - 5, rightDot.y - 5, 10, 10);
			g.drawString(Integer.toString(i + 1), rightDot.x - 5, rightDot.y - 5);
		}
	}

	private void drawLines(Graphics g) {
		// 선 표시
		g.setColor(Color.BLUE); // 선 색깔
		for (Line line : lines) {
			g.drawLine(line.start.x, line.start.y, line.end.x, line.end.y);
		}
	}

	private void startGame() {
		if (!gameStarted) {
			startTime = System.currentTimeMillis();
			timer = new Timer(1000, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
					timerLabel.setText("Time: " + elapsedTime + " seconds");

					if (elapsedTime >= 120) {
						endGame();
						resetGame();
						JOptionPane.showMessageDialog(DotGame.this, "아쉽네요. 다시 시도해봅시다.", "시간 초과",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			});
			timer.start();
			gameStarted = true;
		}
	}

	private void resetGame() {
		lines.clear();
		timer.stop();
		timerLabel.setText("Time: 0 seconds");
		gameStarted = false;
		selectedDot = null;

		// 점 초기화시켜주기
		initializeDots();

		repaint();
	}

	private void connectDots(Point clickPoint) {
		for (Point leftDot : leftDots) {
			if (Math.abs(clickPoint.x - leftDot.x) <= 5 && Math.abs(clickPoint.y - leftDot.y) <= 5) {
				if (selectedDot != null) {
					int leftIndex = leftDots.indexOf(leftDot);
					int rightIndex = rightDots.indexOf(selectedDot);
					if (leftIndex == rightIndex) {
						lines.add(new Line(selectedDot, leftDot));
						repaint();
						selectedDot = null;

						// 모든 점이 연결 됐는지 확인
						if (lines.size() == leftDots.size()) {
							endGame();
							resetGame();
						}
					}
				} else {
					selectedDot = leftDot;
				}
				break;
			}
		}

		for (Point rightDot : rightDots) {
			if (Math.abs(clickPoint.x - rightDot.x) <= 5 && Math.abs(clickPoint.y - rightDot.y) <= 5) {
				if (selectedDot != null) {
					int rightIndex = rightDots.indexOf(rightDot);
					int leftIndex = leftDots.indexOf(selectedDot);
					if (leftIndex == rightIndex) {
						lines.add(new Line(selectedDot, rightDot));
						repaint();
						selectedDot = null;

						// 모든 점이 연결 됐는지 확인
						if (lines.size() == leftDots.size()) {
							endGame();
							resetGame();
						}
					}
				} else {
					selectedDot = rightDot;
				}
				break;
			}
		}
	}

	private void endGame() {
		long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
		timer.stop();
		gameStarted = false;
		JOptionPane.showMessageDialog(this, "완료! " + elapsedTime + "초 걸렸네요.", "게임 종료", JOptionPane.INFORMATION_MESSAGE);
	}

	private class Line {
		Point start;
		Point end;

		Line(Point start, Point end) {
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new DotGame();
			}
		});
	}
}