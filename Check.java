import javax.swing.*;
import java.awt.event.*;

public class Check extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox cb1, cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,
	cb25,cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb34,cb35,cb36,cb37,cb38,cb39,cb40,cb41,cb42,cb43,cb44;
    JButton b;

    Check() {
        l = new JLabel("Food Ordering System");
        l.setBounds(700, 50, 300, 40);
        
        cb1 = new JCheckBox("Pizza @100");
        cb1.setBounds(100, 100, 150, 20);
        
        cb2 = new JCheckBox("Burger @72");
        cb2.setBounds(100, 150, 150, 20);
        
        cb3 = new JCheckBox("French Fries @106");
        cb3.setBounds(100, 200, 200, 20);

	cb4 = new JCheckBox("Sandwich @175");
        cb4.setBounds(100, 250, 150, 20);

	cb5 = new JCheckBox("Pasta @190");
        cb5.setBounds(100, 300, 150, 20);

	cb6 = new JCheckBox("Lasanana Roll @133");
        cb6.setBounds(100, 350, 200, 20);

	cb7 = new JCheckBox("Paneer Salsa wrap @133");
        cb7.setBounds(100, 400, 250, 20);

	cb8 = new JCheckBox("Egg Puff @33");
        cb8.setBounds(100, 450, 250, 20);

	cb9 = new JCheckBox("Paneer Puff @43");
        cb9.setBounds(100, 500, 250, 20);

	cb10 = new JCheckBox("Chicken Puff @35");
        cb10.setBounds(100, 550, 250, 20);

	cb11= new JCheckBox("Veg Puff @30");
        cb11.setBounds(100, 600, 250, 20);

	cb12= new JCheckBox("Chicken Biryani @130");
        cb12.setBounds(450, 100, 250, 20);
        
        cb13 = new JCheckBox("Chicken Burger @72");
        cb13.setBounds(450, 150, 150, 20);
        
        cb14= new JCheckBox("Chicken Fry @106");
        cb14.setBounds(450, 200, 200, 20);

	cb15 = new JCheckBox("Chicken Sandwich @175");
        cb15.setBounds(450, 250, 150, 20);

	cb16 = new JCheckBox("Chicken Pasta @190");
        cb16.setBounds(450, 300, 150, 20);

	cb17 = new JCheckBox("Chicken Roll @133");
        cb17.setBounds(450, 350, 200, 20);

	cb18 = new JCheckBox("Lollipop Biryani @133");
        cb18.setBounds(450, 400, 250, 20);

	cb19 = new JCheckBox("Chicken Puff @33");
        cb19.setBounds(450, 450, 250, 20);

	cb20 = new JCheckBox("Chicken lollipop @143");
        cb20.setBounds(450, 500, 250, 20);

	cb21 = new JCheckBox("Chicken Magestic @135");
        cb21.setBounds(450, 550, 250, 20);

	cb22= new JCheckBox("Chicken fried Rice @110");
        cb22.setBounds(450, 600, 250, 20);

	cb23= new JCheckBox("Veg Biryani @130");
        cb23.setBounds(800, 100, 250, 20);
        
        cb24 = new JCheckBox("Veg Burger @72");
        cb24.setBounds(800, 150, 150, 20);
        
        cb25= new JCheckBox("Veg Fried Rice @106");
        cb25.setBounds(800, 200, 200, 20);

	cb26 = new JCheckBox("Veg Sandwich @175");
        cb26.setBounds(800, 250, 150, 20);

	cb27 = new JCheckBox("Veg Pasta @190");
        cb27.setBounds(800, 300, 150, 20);

	cb28 = new JCheckBox("Veg Roll @133");
        cb28.setBounds(800, 350, 200, 20);

	cb29 = new JCheckBox("Veg Dum Biryani @133");
        cb29.setBounds(800, 400, 250, 20);

	cb30 = new JCheckBox("Vegtable Curry @33");
        cb30.setBounds(800, 450, 250, 20);

	cb31 = new JCheckBox("Mushroom Curry @43");
        cb31.setBounds(800, 500, 250, 20);

	cb32 = new JCheckBox("Potato Curry @35");
        cb32.setBounds(800, 550, 250, 20);

	cb33= new JCheckBox("Chips @30");
        cb33.setBounds(800, 600, 250, 20);

	cb34= new JCheckBox("Fruit Salad @130");
        cb34.setBounds(1150, 100, 250, 20);
        
        cb35 = new JCheckBox("Vennela Ice Cream @72");
        cb35.setBounds(1150, 150, 150, 20);
        
        cb36= new JCheckBox("Butterscoth Ice Cream @106");
        cb36.setBounds(1150, 200, 200, 20);

	cb37 = new JCheckBox("Strawberry @175");
        cb37.setBounds(1150, 250, 150, 20);

	cb38 = new JCheckBox("Chocolate @190");
        cb38.setBounds(1150, 300, 150, 20);

	cb39 = new JCheckBox("Blue mocktile @133");
        cb39.setBounds(1150, 350, 200, 20);

	cb40 = new JCheckBox("Green Mocktile @133");
        cb40.setBounds(1150, 400, 250, 20);

	cb41 = new JCheckBox("Milk Shake @33");
        cb41.setBounds(1150, 450, 250, 20);

	cb42 = new JCheckBox("Oreo Shake @43");
        cb42.setBounds(1150, 500, 250, 20);

	cb43 = new JCheckBox("chocolate Shake @35");
        cb43.setBounds(1150, 550, 250, 20);

	cb44= new JCheckBox("Baadam Milk @30");
        cb44.setBounds(1150, 600, 250, 20);


        
        b = new JButton("Order");
        b.setBounds(700, 650, 80, 30);
        b.addActionListener(this);
        
        add(l);
        add(cb1);
        add(cb2);
        add(cb3);
	add(cb4);
	add(cb5);
	add(cb6);
	add(cb7);
	add(cb8);
	add(cb9);
	add(cb10);
	add(cb11);
	add(cb12);
        add(cb13);
        add(cb14);
        add(cb15);
	add(cb16);
	add(cb17);
	add(cb18);
	add(cb19);
	add(cb20);
	add(cb21);
	add(cb22);
	add(cb23);
	add(cb24);
	add(cb25);
	add(cb26);
	add(cb27);
	add(cb28);
	add(cb29);
	add(cb30);
	add(cb31);
	add(cb32);
	add(cb33);
	add(cb34);
	add(cb35);
	add(cb36);
	add(cb37);
	add(cb38);
	add(cb39);
	add(cb40);
	add(cb41);
	add(cb42);
	add(cb43);
	add(cb44);

        add(b);
        
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (cb1.isSelected()) {
            amount += 100;
            msg = "Pizza: 100\n";
        }
        if (cb2.isSelected()) {
            amount += 72;
            msg += "Burger: 72\n";
        }
        if (cb3.isSelected()) {
            amount += 106;
            msg += "Frech Fries: 106\n";
        }
  	if (cb4.isSelected()) {
            amount += 125;
            msg += "Sandwich: 125\n";
        }
	if (cb5.isSelected()) {
            amount += 190;
            msg += "Pasta: 190\n";
        }
	if (cb6.isSelected()) {
            amount += 133;
            msg += "Lasanana Roll : 133\n";
        }
	if (cb7.isSelected()) {
            amount += 133;
            msg += "Paneer Salsa wrap: 133\n";
        }
	if (cb8.isSelected()) {
            amount += 33;
            msg += "Egg Puff: 33\n";
        }
	if (cb9.isSelected()) {
            amount += 43;
            msg += "Paneer Puff: 43\n";
        }
	if (cb10.isSelected()) {
            amount += 35;
            msg += "Chicken Puff: 35\n";
        }
	if (cb11.isSelected()) {
            amount += 30;
            msg += "Veg Puff: 30\n";
        }
	if (cb12.isSelected()) {
            amount += 130;
            msg += "Chicken Biryani: 130\n";
        }
	if (cb13.isSelected()) {
            amount += 72;
            msg += "Chicken Burger: 72\n";
        }
	if (cb14.isSelected()) {
            amount += 106;
            msg += "Chicken Fry: 106\n";
        }
	if (cb15.isSelected()) {
            amount += 175;
            msg += "Chicken Sandwich: 175\n";
        }
	if (cb16.isSelected()) {
            amount += 190;
            msg += "Chicken Pasta: 190\n";
        }
	if (cb17.isSelected()) {
            amount += 133;
            msg += "Chicken Roll: 133\n";
        }
	if (cb18.isSelected()) {
            amount += 133;
            msg += "Lollipop Biryani: 133\n";
        }
	if (cb19.isSelected()) {
            amount += 33;
            msg += "Chicken Puff: 33\n";
        }
	if (cb20.isSelected()) {
            amount += 106;
            msg += "Chicken Fry: 106\n";
        }
	if (cb21.isSelected()) {
            amount += 143;
            msg += "Chicken Lollipop: 143n";
        }
	if (cb22.isSelected()) {
            amount += 110;
            msg += "Chicken Fried Rice: 110\n";
        }
	if (cb23.isSelected()) {
            amount += 130;
            msg += "Veg Biryani: 130\n";
        }
	if (cb24.isSelected()) {
            amount += 72;
            msg += "Veg Burger: 72\n";
        }
	if (cb25.isSelected()) {
            amount += 106;
            msg += "Veg Fried Rice: 106\n";
        }

	if (cb26.isSelected()) {
            amount += 175;
            msg += "Veg Sandwich: 175\n";
        }
	if (cb27.isSelected()) {
            amount += 190;
            msg += "Veg Pasta: 190\n";
        }
	if (cb28.isSelected()) {
            amount += 133;
            msg += "Veg Roll: 133\n";
        }
	if (cb29.isSelected()) {
            amount += 133;
            msg += "Veg Dum Biryani: 133\n";
        }
	if (cb30.isSelected()) {
            amount += 33;
            msg += "Vegetable Curry: 33\n";
        }
	if (cb31.isSelected()) {
            amount += 43;
            msg += "Mushroom Curry: 43\n";
        }
	if (cb32.isSelected()) {
            amount += 35;
            msg += "Potato Curry: 35\n";
        }
	if (cb33.isSelected()) {
            amount += 30;
            msg += "Chips: 30\n";
        }
	if (cb34.isSelected()) {
            amount += 130;
            msg += "Fruit Salad: 130\n";
        }
	if (cb35.isSelected()) {
            amount += 72;
            msg += "Cherry salad: 72\n";
        }
	if (cb36.isSelected()) {
            amount += 106;
            msg += "ButterScoth Ice Cream: 106\n";
        }
	if (cb37.isSelected()) {
            amount += 175;
            msg += "Strawberry: 175\n";
        }
	if (cb38.isSelected()) {
            amount += 133;
            msg += "Blue Mocktile: 133\n";
        }
	if (cb39.isSelected()) {
            amount += 133;
            msg += "Blue Mocktile: 133\n";
        }
	if (cb40.isSelected()) {
            amount += 133;
            msg += "Green Mocktile: 133\n";
        }
	if (cb41.isSelected()) {
            amount += 33;
            msg += "Milk Shake: 33\n";
        }
	if (cb42.isSelected()) {
            amount += 43;
            msg += "Oreo Shake: 43\n";
        }
	if (cb43.isSelected()) {
            amount += 35;
            msg += "Chocolate Shake: 35\n";
        }
	if (cb44.isSelected()) {
            amount += 30;
            msg += "Badam Milk: 30\n";
        }
        msg += "-----------------------\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
    }

    public static void main(String[] args) {
        new Check();
    }
}
