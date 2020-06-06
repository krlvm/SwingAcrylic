import ru.krlvm.swingacrylic.SwingAcrylic;

import javax.swing.*;
import java.awt.*;

public class SwingAcrylicExample {

    public static void main(String[] args) {
        SwingAcrylic.prepareSwing();

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel label = new JLabel("SwingAcrylic");
        label.setFont(label.getFont().deriveFont(Font.BOLD, 48f));
        frame.add(label, BorderLayout.CENTER);

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        SwingAcrylic.processFrame(frame, 255, 0x990500);
    }
}
