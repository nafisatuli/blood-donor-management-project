package Other;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class show_data {

    public static void main(String s[]) {

        new_one New_one = new new_one();
        New_one.setVisible(true);
        User user = new User();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(5);
                New_one.Load.setText(Integer.toString(i) + "%");
                New_one.jProgressBar1.setValue(i);
                if (i == 100) {
                    New_one.setVisible(false);
                    user.setVisible(true);
                }
            }
        } catch (Exception e) {
        }

    }
}
