import javax.swing.JFrame;

public class GameFrame extends JFrame{

    private static final long serialVersionUID = 1L;

    public void GameFrame(){this.add(new GamePanel());}
    GameFrame() {
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}