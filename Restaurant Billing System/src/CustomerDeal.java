import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.NumberFormat;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Frame;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

public class CustomerDeal {

	private JFrame frmRestaurantBillingSystem;
	private JTextField txtChickenBurger;
	private JTextField txtChickenBurgerMeal;
	private JTextField txtCheeseBurger;
	private JTextField txtDrinksQ;
	private JTextField txtCostofDrinks;
	private JTextField txtCostofDelivery;
	private JTextField txtCostofMeal;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtCustomerName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
	//	getConnection();
		CustomerDeal window = new CustomerDeal();
		window.frmRestaurantBillingSystem.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {}
		});
	}
	/*public static Connection getConnection() throws Exception{
		  try{
		   String driver = "com.mysql.jdbc.Driver";
		   String url = "jdbc:mysql://127.0.0.1:3306/restaurant?useSSL=false";
		   String username = "root";
		   String password = "12345678";
		   Class.forName(driver);
		   
		   Connection conn = DriverManager.getConnection(url,username,password);
		   System.out.println("Connected");
		   return conn;
		  } 
		  catch(Exception e)
		  {System.out.println(e);}
		  return null;
		 }
	/**
	 * Create the application.
	 */
	public CustomerDeal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRestaurantBillingSystem = new JFrame();
		frmRestaurantBillingSystem.getContentPane().setBackground(Color.DARK_GRAY);
		frmRestaurantBillingSystem.setTitle("Restaurant Billing System");
		frmRestaurantBillingSystem.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jayanand\\Desktop\\download.jpg"));
		frmRestaurantBillingSystem.setBackground(Color.WHITE);
		frmRestaurantBillingSystem.setBounds(0,0, 1368, 730);
		frmRestaurantBillingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurantBillingSystem.getContentPane().setLayout(null);
		
		
		JLabel lblName = new JLabel("Restaurant Billing System");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(192, 11, 800, 63);
		lblName.setIcon(new ImageIcon("C:\\Users\\Jayanand\\Desktop\\download.jpg"));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Mangal", Font.BOLD, 30));
		lblName.setBackground(Color.DARK_GRAY);
		frmRestaurantBillingSystem.getContentPane().add(lblName);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(5, 85, 1330, 5);
		frmRestaurantBillingSystem.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 101, 523, 271);
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new LineBorder(new Color(95, 158, 160), 4, true));
		frmRestaurantBillingSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setBounds(10, 11, 208, 34);
		lblChickenBurger.setFont(new Font("Arial Black", Font.BOLD, 20));
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblChickenBurgerMeal.setBounds(10, 56, 250, 34);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCheeseBurger.setBounds(10, 101, 208, 34);
		panel.add(lblCheeseBurger);
		
		txtChickenBurger = new JTextField();
		txtChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		txtChickenBurger.setText("0");
		txtChickenBurger.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtChickenBurger.setBounds(270, 22, 208, 20);
		panel.add(txtChickenBurger);
		txtChickenBurger.setColumns(10);
		
		txtChickenBurgerMeal = new JTextField();
		txtChickenBurgerMeal.setText("0");
		txtChickenBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtChickenBurgerMeal.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtChickenBurgerMeal.setColumns(10);
		txtChickenBurgerMeal.setBounds(270, 64, 208, 20);
		panel.add(txtChickenBurgerMeal);
		
		txtCheeseBurger = new JTextField();
		txtCheeseBurger.setText("0");
		txtCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCheeseBurger.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtCheeseBurger.setColumns(10);
		txtCheeseBurger.setBounds(270, 109, 208, 20);
		panel.add(txtCheeseBurger);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblDrinks.setBounds(10, 146, 208, 34);
		panel.add(lblDrinks);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblQuantity.setBounds(270, 146, 208, 34);
		panel.add(lblQuantity);
		
		JComboBox cmbDrinks = new JComboBox();
		cmbDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink",
								"Apple Juice", "Banana Shake", "Tea", "Coffee", "Cappuccino", "Lemonade", 
									"Lassi-Salty", "Lassi-Sweet", "Black Tea"}));
		cmbDrinks.setFont(new Font("Arial Black", Font.ITALIC, 18));
		cmbDrinks.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		cmbDrinks.setBounds(10, 191, 194, 28);
		panel.add(cmbDrinks);
		
		txtDrinksQ = new JTextField();
		txtDrinksQ.setText("0");
		txtDrinksQ.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDrinksQ.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtDrinksQ.setColumns(10);
		txtDrinksQ.setBounds(270, 194, 208, 20);
		panel.add(txtDrinksQ);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setForeground(UIManager.getColor("CheckBox.foreground"));
		chckbxHomeDelivery.setBackground(UIManager.getColor("CheckBox.background"));
		chckbxHomeDelivery.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxHomeDelivery.setBounds(20, 226, 167, 28);
		panel.add(chckbxHomeDelivery);
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxTax.setBounds(269, 229, 167, 25);
		panel.add(chckbxTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 383, 625, 163);
		panel_1.setBorder(new LineBorder(new Color(95, 158, 160), 4, true));
		panel_1.setBackground(new Color(211, 211, 211));
		frmRestaurantBillingSystem.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		txtCostofDrinks = new JTextField();
		txtCostofDrinks.setText("0");
		txtCostofDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCostofDrinks.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtCostofDrinks.setColumns(10);
		txtCostofDrinks.setBounds(357, 19, 208, 20);
		panel_1.add(txtCostofDrinks);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCostOfDrinks.setBounds(10, 11, 208, 34);
		panel_1.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCostOfMeal.setBounds(10, 56, 208, 34);
		panel_1.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCostOfDelivery.setBounds(10, 101, 208, 34);
		panel_1.add(lblCostOfDelivery);
		
		txtCostofDelivery = new JTextField();
		txtCostofDelivery.setText("0");
		txtCostofDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCostofDelivery.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtCostofDelivery.setColumns(10);
		txtCostofDelivery.setBounds(357, 112, 208, 20);
		panel_1.add(txtCostofDelivery);
		
		txtCostofMeal = new JTextField();
		txtCostofMeal.setText("0");
		txtCostofMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCostofMeal.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtCostofMeal.setColumns(10);
		txtCostofMeal.setBounds(357, 67, 208, 20);
		panel_1.add(txtCostofMeal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(548, 101, 401, 271);
		panel_2.setBorder(new LineBorder(new Color(95, 158, 160), 4, true));
		panel_2.setBackground(new Color(211, 211, 211));
		frmRestaurantBillingSystem.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setBounds(24, 52, 156, 34);
		lblCustomerName.setFont(new Font("Arial Black", Font.PLAIN, 17));
		panel_2.add(lblCustomerName);
		
		JLabel lblCustDetails = new JLabel("Customer Details");
		lblCustDetails.setBounds(38, 11, 353, 34);
		lblCustDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustDetails.setFont(new Font("Arial Black", Font.BOLD, 20));
		panel_2.add(lblCustDetails);
		
		txtCustomerName = new JTextField();
		txtCustomerName.setText("\r\n");
		txtCustomerName.setHorizontalAlignment(SwingConstants.LEFT);
		txtCustomerName.setFont(new Font("SansSerif", Font.BOLD, 16));
		txtCustomerName.setColumns(10);
		txtCustomerName.setBounds(206, 57, 163, 24);
		panel_2.add(txtCustomerName);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblMobileNo.setBounds(24, 117, 156, 34);
		panel_2.add(lblMobileNo);
		
		JLabel lblEmail = new JLabel("E-Mail Add.");
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblEmail.setBounds(24, 180, 156, 34);
		panel_2.add(lblEmail);
		
		JFormattedTextField txtMobileNo = new JFormattedTextField(NumberFormat.getNumberInstance());
		txtMobileNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtMobileNo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMobileNo.setBounds(206, 125, 163, 24);
		txtMobileNo.setColumns(10);
		panel_2.add(txtMobileNo);
		
		JFormattedTextField txtEmail = new JFormattedTextField();
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEmail.setBounds(206, 187, 163, 24);
		panel_2.add(txtEmail);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(650, 383, 299, 163);
		panel_3.setBorder(new LineBorder(new Color(95, 158, 160), 4, true));
		panel_3.setBackground(new Color(211, 211, 211));
		frmRestaurantBillingSystem.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTa = new JLabel("Tax");
		lblTa.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTa.setBounds(10, 11, 54, 34);
		panel_3.add(lblTa);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblSubTotal.setBounds(10, 56, 112, 34);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTotal.setBounds(11, 101, 68, 34);
		panel_3.add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setText("\r\n");
		txtTax.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTax.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtTax.setColumns(10);
		txtTax.setBounds(126, 19, 163, 20);
		panel_3.add(txtTax);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setText("\r\n");
		txtSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSubTotal.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(126, 67, 163, 20);
		panel_3.add(txtSubTotal);
		
		txtTotal = new JTextField();
		txtTotal.setText("\r\n");
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setFont(new Font("SansSerif", Font.BOLD, 18));
		txtTotal.setColumns(10);
		txtTotal.setBounds(126, 112, 163, 20);
		panel_3.add(txtTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(959, 101, 376, 445);
		panel_4.setBorder(new LineBorder(new Color(95, 158, 160), 4, true));
		panel_4.setBackground(new Color(211, 211, 211));
		frmRestaurantBillingSystem.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 356, 423);
		panel_4.add(tabbedPane);
		
		JPanel preciept = new JPanel();
		tabbedPane.addTab("Receipt", null, preciept, null);
		preciept.setLayout(null);
		
		JTextArea txtReciept = new JTextArea();
		txtReciept.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 14));
		txtReciept.setBounds(0, 0, 351, 395);
		preciept.add(txtReciept);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(15, 557, 1320, 124);
		panel_5.setBorder(new LineBorder(new Color(95, 158, 160), 4, true));
		panel_5.setBackground(new Color(211, 211, 211));
		frmRestaurantBillingSystem.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChickBurger=Double.parseDouble(txtChickenBurger.getText());
				double iChickBurgerPrice=235.00;
				double Burger;
				Burger=(ChickBurger*iChickBurgerPrice);
				String cMeal= String.format("Rs. %.2f", Burger);
				txtCostofMeal.setText(cMeal);
				
				double ChickBurgerMeal=Double.parseDouble(txtChickenBurgerMeal.getText());
				double iChickBurgerMealPrice=295.00;
				double cBurger;
				cBurger= ChickBurgerMeal*iChickBurgerMealPrice;
				String cbMeal=String.format("Rs. %.2f", cBurger+Burger);
				txtCostofMeal.setText(cbMeal);
				
				double CheeseBurger=Double.parseDouble(txtCheeseBurger.getText());
				double iCheeseBurgerPrice=245.00;
				double chMeal;
				chMeal=CheeseBurger*iCheeseBurgerPrice;
				String chbMeal=String.format("Rs. %.2f", cBurger+Burger+chMeal);
				txtCostofMeal.setText(chbMeal);
				
				double iHomeDelivery=120.00;
				if(chckbxHomeDelivery.isSelected())
				{
					String pDelivery= String.format("Rs. %.2f", iHomeDelivery);
					txtCostofDelivery.setText(pDelivery);					
				}
				else
				{
					txtCostofDelivery.setText("0");
				}
				
				double Drinks=Double.parseDouble(txtDrinksQ.getText());
				double Apple_Juice=45*Drinks;
				double Banana_Shake=45*Drinks;
				double Tea=10*Drinks;
				double Coffee=15*Drinks;
				double Cappuccino=30*Drinks;
				double Lemonade= 25*Drinks;
				double Lassi_Salty=30*Drinks;
				double Lassi_Sweet=35*Drinks;
				double Black_Tea=15*Drinks;
				
				if(cmbDrinks.getSelectedItem().equals("Apple Juice"))
				{
					String cApple_Juice=String.format("Rs. %.2f", Apple_Juice);
					 txtCostofDrinks.setText(cApple_Juice);
				}
				else
					if(cmbDrinks.getSelectedItem().equals("Banan Shake"))
					{
						String cBanan_Shake=String.format("Rs. %.2f", Banana_Shake);
						txtCostofDrinks.setText(cBanan_Shake);
					}
					else
						if(cmbDrinks.getSelectedItem().equals("Tea"))
						{
							String cTea=String.format("Rs. %.2f", Tea);
							txtCostofDrinks.setText(cTea);
						}
						else
							if(cmbDrinks.getSelectedItem().equals("Coffee"))
							{
								String cCoffee=String.format("Rs. %.2f", Coffee);
								txtCostofDrinks.setText(cCoffee);
							}
							else
								if(cmbDrinks.getSelectedItem().equals("Cappuccino"))
								{
									String cCapp=String.format("Rs. %.2f", Cappuccino);
									txtCostofDrinks.setText(cCapp);
									
								}
								else
									if(cmbDrinks.getSelectedItem().equals("Lemonade"))
									{
										String cLemonade=String.format("Rs. %.2f", Lemonade);
										txtCostofDelivery.setText(cLemonade);
									}
									else
										if(cmbDrinks.getSelectedItem().equals("Lassi-Salty")) 
										{
											String cLassi=String.format("Rs. %.2f", Lassi_Salty);
											txtCostofDelivery.setText(cLassi);											
										}
										else
											if(cmbDrinks.getSelectedItem().equals("Lassi-Sweet"))
											{
												String cLassiS=String.format("Rs. %.2f", Lassi_Sweet);
												txtCostofDelivery.setText(cLassiS);
												
											}
											else
												if(cmbDrinks.getSelectedItem().equals("Black Tea"))
												{
													String cBlack= String.format("Rs. %.2f", Black_Tea);
													txtCostofDelivery.setText(cBlack);
												}
												else
													if(cmbDrinks.getSelectedItem().equals("Select a Drink"))
													{
														txtCostofDrinks.setText("0");
													}		
				double ctotal1=Double.parseDouble(txtCostofDrinks.getText());
				double ctotal2=Double.parseDouble(txtCostofMeal.getText());
				double ctotal3=Double.parseDouble(txtCostofDelivery.getText());
				double subtotal=ctotal1+ctotal2+ctotal3;
				String isubtotal=String.format("Rs. %.2f", subtotal);
				txtSubTotal.setText(isubtotal);
				double tax=(5*subtotal)/100;				
				if(chckbxTax.isSelected())
				{
					String itotal= String.format("Rs. %.2f",tax);
					txtTax.setText(itotal);
				}
							
				/*----------------------------Total--------------------------*/
				
				String Alltotal=String.format("Rs. %.2f", subtotal+tax);
				txtTotal.setText(Alltotal);
			}
		});
		btnTotal.setBounds(156, 25, 121, 56);
		panel_5.add(btnTotal);
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double qty1=Double.parseDouble(txtChickenBurger.getText());
				double qty2=Double.parseDouble(txtChickenBurgerMeal.getText());
				double qty3=Double.parseDouble(txtCheeseBurger.getText());
				double qty4=Double.parseDouble(txtDrinksQ.getText());
				if(txtCustomerName.getText()==null)
				{
					JOptionPane.showMessageDialog(null,"Fill name please!!!");
				}else
				if(txtEmail.getText()==null)
				{
					JOptionPane.showMessageDialog(null,"Fill Email please!!!");
				}else
				if(txtMobileNo.getText()==null)
				{
					JOptionPane.showMessageDialog(null,"Fill number please!!!");
				}
				else
				txtReciept.append(
					"\nRestaurant Management Sytem\n\n"+"\t\tFor "+txtCustomerName.getText().toString()+"\n\t\tNumber:"+
					txtMobileNo.getText().toString()+"\n\t\tEmail:"+txtEmail.getText().toString()+
					"\nChicken Burger\t\t\t"+qty1+"\n"+"Chicken Burger Meal\t\t"+qty2+
					"\nCheese Burger\t\t\t"+qty3+"\n"+cmbDrinks.getSelectedItem().toString()+"\t"+qty4+"\nCost of Delivery\t\t"
					+txtCostofDelivery.getText().toString()+"\nCost of Meal\t\t"+txtCostofMeal.getText().toString()+"\nTax\t\t\t"
					+txtTax.getText().toString()+"\nTotal\t\t\t"+txtTotal.getText().toString());
			}
		});
		btnReciept.setBounds(430, 25, 121, 56);
		panel_5.add(btnReciept);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtChickenBurger.setText("0");
				txtChickenBurgerMeal.setText("0");
				txtCheeseBurger.setText("0");
				txtTax.setText("0");
				txtSubTotal.setText("0");
				txtDrinksQ.setText("0");
				txtTotal.setText("0");
				cmbDrinks.setSelectedItem("Select a Drink");
				txtCostofMeal.setText("0");
				txtCostofDelivery.setText("0");
				txtCostofDrinks.setText("0");
				txtCustomerName.setText(null);
				txtMobileNo.setText(null);
				txtEmail.setText(null);
				
			}
		});
		btnReset.setBounds(730, 25, 121, 56);
		panel_5.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(1046, 25, 121, 56);
		panel_5.add(btnExit);
	}
}
