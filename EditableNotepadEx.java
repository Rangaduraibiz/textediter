

import java.awt.event.*;  
import javax.swing.*; 

public class EditableNotepadEx implements ActionListener  
{  
    JFrame frm;  
    JMenuBar mnubr;  
    JMenu fileMenu, editMenu, helpMenu,themeMenu;  
    JMenuItem cutItem, copyItem, pasteItem, selectAll,saveItem,darkMode,lightMode;  
    JTextArea txtarea;  
    EditableNotepadEx()  
    {  
        frm = new JFrame();  
        cutItem = new JMenuItem("cutItem");  
        saveItem = new JMenuItem("Save");
        copyItem = new JMenuItem("copyItem");  
        pasteItem = new JMenuItem("pasteItem");  
        selectAll = new JMenuItem("selectAllItem");
        darkMode = new JMenuItem("Dark Mode");
        lightMode = new JMenuItem("light Mode");

        copyItem.addActionListener(this);  
        cutItem.addActionListener(this);  
        selectAll.addActionListener(this);  
        pasteItem.addActionListener(this);  
        mnubr = new JMenuBar();  
        mnubr.setBounds(5, 5, 860, 40);  
        fileMenu = new JMenu("File");  
        editMenu = new JMenu("Edit");  
        helpMenu = new JMenu("Help");  
        themeMenu = new JMenu("Theme");  

        fileMenu.add(saveItem);
        editMenu.add(cutItem);  
        editMenu.add(copyItem);  
        editMenu.add(pasteItem);  
        editMenu.add(selectAll);
        
        themeMenu.add(darkMode);
        themeMenu.add(lightMode);
        mnubr.add(fileMenu);  
        mnubr.add(editMenu);  
        mnubr.add(helpMenu); 
        mnubr.add(themeMenu); 
        txtarea = new JTextArea();  
        txtarea.setBounds(10, 30, 460, 460);  
        frm.add(mnubr);  
        frm.add(txtarea);  
        frm.setLayout(null);  
        frm.setSize(500, 500);  
        frm.setVisible(true);  
    }

//     public void saveFile(){
//         final JFileChooser SaveAs = new JFileChooser();
//            SaveAs.setApproveButtonText("Save");
//            //Opening the dialog and asking from user where to save the file.
//            int actionDialog = SaveAs.showOpenDialog(f);
//            if (actionDialog != JFileChooser.APPROVE_OPTION) {
//                return;
//            }
//            File fileName = new File(SaveAs.getSelectedFile() + ".txt");
//            BufferedWriter outFile = null;
//            try {
//                outFile = new BufferedWriter(new FileWriter(fileName));
//                area.write(outFile);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//    }
  
    public void actionPerformed(ActionEvent ae)  
    {  
        if (ae.getSource() == cutItem)  
            txtarea.cut();  
        if (ae.getSource() == pasteItem)  
            txtarea.paste();  
        if (ae.getSource() == copyItem)  
            txtarea.copy();  
        if (ae.getSource() == selectAll)  
            txtarea.selectAll(); 
        //if(ae.getSource() == saveItem)
//           savefile();
 
    }       
}