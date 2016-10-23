package com.details;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class WageCalculator extends JFrame 
{
   // JLabel and JTextField for wage per hour
   private JLabel hourlyWageJLabel;
   private JTextField hourlyWageJTextField;

   // JLabel and JTextField for hours worked in a week
   private JLabel hoursWorkedJLabel;
   private JTextField hoursWorkedJTextField;
   
   // JLabel and JTextField for gross wages
   private JLabel grossWagesJLabel;
   private JTextField grossWagesJTextField;
   
   // JButton to initiate wage calculation
   private JButton calculateJButton;
   
   
   public WageCalculator()
   {
      createUserInterface();
   }   
   
   
   public void createUserInterface()
   {
      
      Container contentPane = getContentPane();

      
      contentPane.setLayout( null ); 

      
      hourlyWageJLabel = new JLabel();
      hourlyWageJLabel.setBounds( 16, 16, 90, 21 );
      hourlyWageJLabel.setText( "Hourly wage:" );
      contentPane.add( hourlyWageJLabel );
      
      
      hourlyWageJTextField = new JTextField();
      hourlyWageJTextField.setBounds( 120, 16, 90, 21 );
      hourlyWageJTextField.setHorizontalAlignment( 
         JTextField.RIGHT );
      contentPane.add( hourlyWageJTextField );
      
     
      hoursWorkedJLabel = new JLabel();
      hoursWorkedJLabel.setBounds( 16, 56, 90, 21 );
      hoursWorkedJLabel.setText( "Hours worked:" );
      contentPane.add( hoursWorkedJLabel );
      
      
      hoursWorkedJTextField = new JTextField();
      hoursWorkedJTextField.setBounds( 120, 56, 90, 21 );
      hoursWorkedJTextField.setHorizontalAlignment( 
         JTextField.RIGHT );
      contentPane.add( hoursWorkedJTextField );
      
      
      grossWagesJLabel = new JLabel();
      grossWagesJLabel.setBounds( 16, 96, 90, 21 );
      grossWagesJLabel.setText( "Gross wages:" );
      contentPane.add( grossWagesJLabel );
      
      
      grossWagesJTextField = new JTextField();
      grossWagesJTextField.setBounds( 120, 96, 90, 21 );
      grossWagesJTextField.setHorizontalAlignment( 
         JTextField.RIGHT );
      grossWagesJTextField.setEditable( false );
      contentPane.add( grossWagesJTextField );
      
      
      calculateJButton = new JButton();
      calculateJButton.setBounds( 120, 136, 90, 24 );
      calculateJButton.setText( "Calculate" );
      contentPane.add( calculateJButton );
      calculateJButton.addActionListener(
         
         new ActionListener() 
         {          
            
             public void actionPerformed ( ActionEvent event )
             {
                calculateJButtonActionPerformed( event );
             }

         } 
      ); 
      
      
      setTitle( "Wage Calculator" ); 
      setSize( 230, 200 );           
      setVisible( true );            
      
   } 
   
   
   private void calculateJButtonActionPerformed( ActionEvent event )
   {
      
      double hourlyWage = 
         Double.parseDouble( hourlyWageJTextField.getText() );

     
      double hoursWorked = 
         Double.parseDouble( hoursWorkedJTextField.getText() );

          double totalWages = calculatePay( hoursWorked, hourlyWage );

      
      DecimalFormat dollars = new DecimalFormat( "$0.00" );

      
      grossWagesJTextField.setText( dollars.format( totalWages ) );

   } 
   
   
   private double calculatePay( double hours, double wages )
   {
      
      double total;       
         total = wages * hours;
    
      return total;
      
   } 

} 