package Practise;

import java.awt.BorderLayout;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Countdown {//类
    private JFrame frame;//窗口
    private JPanel panel;//画板
    private JLabel countLabel;//标签

    public Countdown() {//构造方法
        frame = new JFrame("倒计时动画");//窗口设置
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时自动关闭程序
        frame.setSize(400, 150);//
        frame.setLocationRelativeTo(null);//让内容在窗口中居中显示

        panel = new JPanel();
        panel.setBackground(Color.BLACK);//设置面板颜色

        countLabel = new JLabel("10");
        countLabel.setForeground(Color.WHITE);//设置标签颜色
        countLabel.setFont(new Font("Arial", Font.BOLD, 100));//设置字体,Arial型,粗体,50大小

        panel.add(countLabel);//将标签添加画板中
        frame.getContentPane().add(panel, BorderLayout.CENTER);//将面板添加到窗口的中心
        frame.setVisible(true);//显示窗口
    }

    public void start(int seconds) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = seconds;

            public void run() {
                if (count == 0) {
                    timer.cancel();
                } else {
                    countLabel.setText(String.valueOf(count)); // 将倒计时数字设置为标签的文本
                    count--;
                    panel.repaint();// 重绘面板，实现动画效果
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);// 每隔1秒执行一次任务
    }

    public static void main(String[] args) {
        Countdown gui = new Countdown();
        gui.start((60+60+19)*60);
    }
}