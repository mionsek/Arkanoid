import javax.swing.*;

public class App extends JFrame {

    private App(){
        initUI();
    }

    private void initUI(){
        setTitle("Arkanoid");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(StartVariables.WIDTH, StartVariables.HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                App game = new App();
                game.setVisible(true);
            }
        });
    }
}
