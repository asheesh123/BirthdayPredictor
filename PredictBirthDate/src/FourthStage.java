import java.awt.*;
import java.awt.event.*;
public class FourthStage extends Frame implements ActionListener,ItemListener
{
	TextArea ta;
	Checkbox c1,c2,c11,c22;
	CheckboxGroup cbg,cbg1;
	Label l,l1,l11;
	Button b1;
	ThirdStage p;
	public FourthStage(ThirdStage p1)
	{
		setLayout(null);
		p=p1;
		ta=new TextArea("",4,200,3);
		l=new Label("Select right answer and press NEXT");
		l1=new Label("1.Is your birthday is here?");
		l11=new Label("2.Is your Birth month is here?");
		cbg=new CheckboxGroup();
		cbg1=new CheckboxGroup();
		c1=new Checkbox("yes",false,cbg);
		c2=new Checkbox("no",true,cbg);
		c11=new Checkbox("yes",false,cbg1);
		c22=new Checkbox("no",true,cbg1);
		b1=new Button("next");
		l.setBounds(170,150,440,30);
		ta.setBounds(200,200,400,300);
		l1.setBounds(170,510,300,30);
		c1.setBounds(475,510,63,30);
		c2.setBounds(542,510,63,30);
		l11.setBounds(170,550,300,30);
		c11.setBounds(475,550,63,30);
		c22.setBounds(542,550,63,30);
		b1.setBounds(330,600,150,40);
		ta.append("\n       2             3             6            7 \n\n\n");
		ta.append("      10           11           14           15 \n\n\n");
		ta.append("      18           19           22           23 \n\n\n");
		ta.append("      26           27           30           31 ");
		add(l);add(ta);add(l1);add(c1);add(c2);add(b1);add(l11);add(c11);add(c22);
		ta.setEditable(false);
		b1.setBackground(Color.cyan);
		l.setBackground(Color.orange);
		c1.setBackground(Color.lightGray);
		c2.setBackground(Color.ORANGE);
		l1.setBackground(Color.gray);
		c11.setBackground(Color.ORANGE);
		c22.setBackground(Color.lightGray);
		l11.setBackground(Color.gray);
		b1.addActionListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c11.addItemListener(this);
		c22.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1==cbg.getSelectedCheckbox())
		{
			p.p.p.a[3]=1;
		}
		if(c2==cbg.getSelectedCheckbox())
		{
			p.p.p.a[3]=0;
		}
		if(c11==cbg1.getSelectedCheckbox())
		{
			p.p.p.b[3]=1;
		}
		if(c22==cbg1.getSelectedCheckbox())
		{
			p.p.p.b[3]=0;
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(b1==ae.getSource())
		{
			FifthStage s=new FifthStage(this);
			s.setSize(800,700);
			s.setVisible(true);
			s.setTitle("Fifth Stage");
			s.setBackground(Color.white);
			Font font=new Font(Font.DIALOG,Font.PLAIN,20);
			s.setFont(font);
		}
	}

}
