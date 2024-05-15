import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            //For choosing files
            JFileChooser fileChooser = new JFileChooser();

            //We can set current directory
            fileChooser.setCurrentDirectory(new File("."));

            //To open our dialog menu
            int response = fileChooser.showOpenDialog(null);//select file to open



            //int response = fileChooser.showSaveDialog(null); = = == = = = =   > For saving a file

            //System.out.println(fileChooser.showOpenDialog(null));//select file to open

            //Prints file path/Location
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

        }
    }
}
