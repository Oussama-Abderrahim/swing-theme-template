import theme.SButton;
import theme.SPanel;
import theme.Theme;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame
{
    private SPanel contentPane;

    public MainFrame()
    {
        initWindow();

        contentPane.setLayout(new FlowLayout());
        contentPane.add(new SButton("Look Awesome"));

    }

    private void initWindow()
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, Theme.WINDOW_WIDTH, Theme.WINDOW_HEIGHT);

        contentPane = new SPanel();
        contentPane.setLayout(new BorderLayout(5,5));
        setContentPane(contentPane);
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
