package Notepadeditor;
/*
 * This is my first project ever hope you will enjoy it! 
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class Notepad implements ActionListener
{
	JFrame jf, replaceframe, front_frame;
	JMenuBar menubar; //menu-bar
	JMenu file, edit, format, help; //menu options
	JTextArea textarea;
	JFileChooser filechooser;
	JButton jb1,cb_cancel, cb_ok ;
	JTextField jt1, jt2;
	JLabel jl1,jl2;
	JComboBox<String> cb_front_family , cb_front_style , cb_front_size;
	JMenuItem neww, open, save , saveas , pagesetup , exit , pageprint, cut, copy, paste, replace, date_time,
		open_font_menu, font_color, textarea_color,help_text ;
	JCheckBoxMenuItem word_wrap;
	FileOutputStream fos;
	File file1;
	String title="NotePad";
	Notepad()
	{
		try 
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		jf=new JFrame(title);
		jf.setSize(500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image Icon = Toolkit.getDefaultToolkit().getImage("D:\\Eclipse-Workspace\\NotePadEditor\\kisspng-paper-notebook-writing-diary-clip-art-small-notepad-cliparts-5a866e12453104.0474765915187594422834.png");
		jf.setIconImage(Icon);
		menubar=new JMenuBar();
		file= new JMenu("File");
		edit=new JMenu("Edit");
		format=new JMenu("Format");
		help=new JMenu("Help");
		
		//items of file menu
		neww=new JMenuItem("New");
		neww.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
		neww.addActionListener(this);
		file.add(neww);
		open=new JMenuItem("Open");
		open.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
		open.addActionListener(this);
		file.add(open);
		save=new JMenuItem("Save");
		save.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
		save.addActionListener(this);
		file.add(save);
		saveas=new JMenuItem("Save As");
		saveas.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.SHIFT_DOWN_MASK));
		saveas.addActionListener(this);
		file.add(saveas);
		file.addSeparator();
		pagesetup=new JMenuItem("Page Setup");
		pagesetup.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_DOWN_MASK));
		pagesetup.addActionListener(this);
		file.add(pagesetup);
		pageprint=new JMenuItem("Page Print");
		pageprint.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.SHIFT_DOWN_MASK));
		pageprint.addActionListener(this);
		file.add(pageprint);
		file.addSeparator();
		exit=new JMenuItem("Exit");
		exit.addActionListener(this);
		file.add(exit);
		
		//menu for edit
		cut=new JMenuItem("Cut");
		cut.setAccelerator(KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK));
		cut.addActionListener(this);
		edit.add(cut);
		copy=new JMenuItem("Copy");
		copy.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK));
		copy.addActionListener(this);
		edit.add(copy);
		paste=new JMenuItem("Paste");
		paste.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_DOWN_MASK));
		paste.addActionListener(this);
		edit.add(paste);
		replace=new JMenuItem("Replace");
		replace.addActionListener(this);
		edit.add(replace);
		edit.addSeparator();
		date_time = new JMenuItem("Date/Time");
		date_time.addActionListener(this);
		edit.add(date_time);
		
		//menu for format
		word_wrap = new JCheckBoxMenuItem("Word Wrap");
		word_wrap.addActionListener(this);
		format.add(word_wrap);
		format.addSeparator();
		open_font_menu = new JMenuItem("Font...");
		open_font_menu.addActionListener(this);
		format.add(open_font_menu);
		format.addSeparator();
		font_color =new JMenuItem("Font Color");
		font_color.addActionListener(this);
		format.add(font_color);
		textarea_color= new JMenuItem("Text Color");
		textarea_color.addActionListener(this);
		format.add(textarea_color);
		
		//menu for help
		help_text= new JMenuItem("Please contact for any help: +91-7007581106 ");
		help.add(help_text);
		
		// for text space
		textarea=new JTextArea();
		
		//for scroll Panel
		JScrollPane scrollpane= new JScrollPane(textarea);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jf.add(scrollpane);
		
		menubar.add(file);
		menubar.add(edit);
		menubar.add(format);
		menubar.add(help);
		
		jf.setJMenuBar(menubar);
		jf.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		filechooser=new JFileChooser();
		if (e.getSource()==neww)
		{
			newtab();
		}
		if (e.getSource()==exit)
		{
			exit();
		}
		if (e.getSource()==save)
		{
			save();
		}
		if (e.getSource()==open)
		{
			open();
		}
		if (e.getSource()==saveas)
		{
			saveAs();
		}
		if (e.getSource()==pagesetup)
		{
			pagesetup();
		}
		if (e.getSource()==pageprint)
		{
			pageprint();
		}
		if (e.getSource()==cut)
		{
			textarea.cut();
		}
		if (e.getSource()==copy)
		{
			textarea.copy();
		}
		if (e.getSource()==paste)
		{
			textarea.paste();
		}
		if (e.getSource()==replace)
		{
			replaceframe();
		}
		if(e.getSource()==jb1)
		{
			replace();
		}
		if (e.getSource()==date_time)
		{
			dateTime();
		}
		if (e.getSource()==open_font_menu)
		{
			openFontFrame();
		}
		if (e.getSource()==font_color)
		{
			font_color();
		}
		if (e.getSource()==textarea_color)
		{
			textarea_color();
		}
		if(e.getSource()==cb_ok)
		{
			setFrontInNotepad();
		}
		if(e.getSource()==cb_cancel)
		{
			front_frame.setVisible(false);
		}
		if(e.getSource()==word_wrap)
		{
		boolean b=word_wrap.getState();
		textarea.setLineWrap(b);
		}
		
	}
	public void newtab()
	{
		String text=textarea.getText();
		if (!text.equals(" "))
		{
			int i=JOptionPane.showConfirmDialog(jf, "Do you want to save this file ?");
			if (i==0)
			{
				saveAs();
				if (!jf.getTitle().equals(title))
				{
					setTilte(title);
					textarea.setText(" ");
				}			
			}
			else if (i==1)
			{
				
			}
			else
			{
				
			}
		}
	}
	public void saveAs()
	{
		JFileChooser filechooser = new JFileChooser();
		int i=filechooser.showSaveDialog(jf);
		if (i==0)
		{
			try
			{
				String text=textarea.getText();
				byte[] b=text.getBytes();
				file1=filechooser.getSelectedFile();
				
				FileOutputStream	fos= new FileOutputStream(file1);
				fos.write(b);
				fos.close();
				setTilte(file1.getName());
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(jf, "You didn't save the file...! ", "File Not Save", JOptionPane.WARNING_MESSAGE);
		}
	}
	public void setTilte(String title)
	{
		jf.setTitle(title);
	}
	public void exit()
	{
		System.exit(0);
	}
	public void open()
	{
		try
		{
			int i=filechooser.showOpenDialog(jf);
			if (i==0)
			{
				textarea.setText(" ");
				FileInputStream fis=new FileInputStream(filechooser.getSelectedFile());
				int ii;
				while ((ii=fis.read()) != -1)
				{
					textarea.append(String.valueOf((char)ii));
				}
				fis.close();
				setTilte(filechooser.getSelectedFile().getName());
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void save()
	{
		if (jf.getTitle().equals(title))
		{
			saveAs();
		}
		else
		{
			String text=textarea.getText();
			byte[] b=text.getBytes();
			try 
			{
				FileOutputStream	fos= new FileOutputStream(file1);
				fos.write(b);
				fos.close();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public void pagesetup()
	{
		PrinterJob pj = PrinterJob.getPrinterJob();
		PageFormat pf = pj.pageDialog(pj.defaultPage());
	}
	public void pageprint()
	{
		PrinterJob pj = PrinterJob.getPrinterJob();
		    if (pj.printDialog()) {
		        try 
		        {
		        	pj.print();
		        }
		        catch (PrinterException exc) 
		        {
		            System.out.println(exc);
		         }
		     }   
	}
	public void replaceframe()
	{
		replaceframe =new JFrame("Replace");
		replaceframe.setSize(500, 300);
		replaceframe.setLayout(null);
		
		jl1=new JLabel("Find What :");
		jl1.setBounds(50, 50, 80, 40);
		replaceframe.add(jl1);
		
		jt1=new JTextField();
		jt1.setBounds(170, 50, 200, 40);
		replaceframe.add(jt1);
		
		jl2=new JLabel("Replace with :");
		jl2.setBounds(50, 100, 100, 40);
		replaceframe.add(jl2);
		
		 jt2=new JTextField();
		jt2.setBounds(170, 100, 200, 40);
		replaceframe.add(jt2);
		
		jb1= new JButton("Replace");
		jb1.addActionListener(this);
		jb1.setBounds(200, 150, 100, 40);
		replaceframe.add(jb1);
		replaceframe.setVisible(true);
	}
	public void replace()
	{
		String find_what=jt1.getText();
		String replace_with=jt2.getText();
		String text= textarea.getText();
		String new_text=text.replace(find_what, replace_with);
		textarea.setText(new_text);
		replaceframe.setVisible(false);
	}
	public void dateTime()
	{
		LocalDateTime ldt= LocalDateTime.now();
		String datetime= ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		textarea.append(datetime);
	}
	public void font_color()
	{
		Color c=JColorChooser.showDialog(jf, "Select Font Color", Color.black);
		textarea.setForeground(c);
	}
	public void textarea_color()
	{
		Color c=JColorChooser.showDialog(jf, "Select Text Area Color", Color.white);
		textarea.setBackground(c);
	}
	public void openFontFrame()
	{
		front_frame = new JFrame("Font...");
		front_frame.setSize(500, 300);
		front_frame.setLayout(null);
		front_frame.setVisible(true);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String [] fontFamilies = ge.getAvailableFontFamilyNames();
		cb_front_family=new JComboBox<String>(fontFamilies);
		cb_front_family.setBounds(30, 50, 150, 30);
		front_frame.add(cb_front_family);
		
		String [] fontStyle= {"Plain","Bold","Italic"};
		cb_front_style=new JComboBox<String>(fontStyle);
		cb_front_style.setBounds(200, 50, 100, 30);
		front_frame.add(cb_front_style);
		
		Integer [] frontSize= {10,11,12,13,14,15,16,17,18,19,20};
		cb_front_size= new JComboBox(frontSize);
		cb_front_size.setBounds(320, 50, 40, 20);
		front_frame.add(cb_front_size);
		
		cb_ok =new JButton("Ok");
		cb_ok.addActionListener(this);
		cb_ok.setBounds(200, 150, 50, 30);
		front_frame.add(cb_ok);
		
		cb_cancel=new JButton("Cancel");
		cb_cancel.addActionListener(this);
		cb_cancel.setBounds(290, 150, 80, 30);
		front_frame.add(cb_cancel);
	}
	public void setFrontInNotepad()
	{
		String fontFaimly=(String) cb_front_family.getSelectedItem();
		String fontStyle=(String) cb_front_style.getSelectedItem();
		Integer front_size=(Integer) cb_front_size.getSelectedItem();
		
		int font_Style=0;
		if (fontStyle.equals("Plain"))
		{
			font_Style=Font.PLAIN;
		}
		else if (fontStyle.equals("Bold"))
		{
			font_Style=Font.BOLD;
		}
		else 
		{
			font_Style=Font.ITALIC;
		}
		Font f=new Font(fontFaimly, font_Style, front_size);
		textarea.setFont(f);
		front_frame.setVisible(false);
	}
}

