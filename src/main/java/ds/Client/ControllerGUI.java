//package ds.Client;
//
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//
//import javax.swing.*;
//import javax.swing.border.EmptyBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ControllerGUI implements ActionListener {
//
//    private JTextField entry1, reply1;
//    private JTextField entry2, reply2;
//    private JTextField entry3, reply3;
//
//
//    private JPanel getService1JPanel() {
//
//        JPanel panel = new JPanel();
//
//        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
//
//        JLabel label = new JLabel("Enter value")	;
//        panel.add(label);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//        entry1 = new JTextField("",10);
//        panel.add(entry1);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//
//        JButton button = new JButton("Invoke Service 1");
//        button.addActionListener(this);
//        panel.add(button);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//
//        reply1 = new JTextField("", 10);
//        reply1 .setEditable(false);
//        panel.add(reply1 );
//
//        panel.setLayout(boxlayout);
//
//        return panel;
//
//    }
//
//    public static void main(String[] args) {
//        ControllerGUI gui = new ControllerGUI();
//        gui.build();
//    }
//
//    private void build() {
//        JFrame frame = new JFrame("Service Controller Sample");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Set the panel to add buttons
//        JPanel panel = new JPanel();
//
//        // Set the BoxLayout to be X_AXIS: from left to right
//        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
//
//        panel.setLayout(boxlayout);
//
//        // Set border for the panel
//        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
//
//        panel.add( getService1JPanel() );
////        panel.add( getService2JPanel() );
////        panel.add( getService3JPanel() );
////        panel.add( getService4JPanel() );
//
//        // Set size for the frame
//        frame.setSize(300, 300);
//
//        // Set the window to be visible as the default to be false
//        frame.add(panel);
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JButton button = (JButton)e.getSource();
//        String label = button.getActionCommand();
//
//        if (label.equals("Invoke Service 1")) {
//            System.out.println("service 1 to be invoked ...");
//
//            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
//            Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);
//
//            //preparing message to send
//            ds.service1.RequestMessage request = ds.service1.RequestMessage.newBuilder().setText(entry1.getText()).build();
//
//            //retreving reply from service
//            ds.service1.ResponseMessage response = blockingStub.service1Do(request);
//
//            reply1.setText( String.valueOf( response.getLength()) );
//
//        }else if (label.equals("Invoke Service 2")) {
//            System.out.println("service 2 to be invoked ...");
//
//
//        }else if (label.equals("Invoke Service 3")) {
//            System.out.println("service 3 to be invoked ...");
//
//
//
//        }else{
//
//        }
//
//    }
//
//
//}
//}
