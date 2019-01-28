import java.awt.*;
import java.awt.event.*;
public class FinalStage extends Frame implements ActionListener
{
	TextArea ta;
	Label l,l1;
	Button b1;
	FifthStage p;
	public FinalStage(FifthStage p1)
	{
		setLayout(null);
		p=p1;
		ta=new TextArea("",4,200,3);
		l=new Label("Your Birth Date is Calculated");
		l1=new Label("Press to see your result");
		b1=new Button("PRESS IT");
		l.setBounds(200,150,400,30);
		ta.setBounds(200,200,400,300);
		l1.setBounds(200,510,270,30);
		b1.setBounds(350,550,150,40);
		add(l);add(ta);add(l1);add(b1);
		ta.setEditable(false);
		ta.setBackground(Color.white);
		b1.setBackground(Color.GREEN);
		l.setBackground(Color.orange);
		l1.setBackground(Color.cyan);
		b1.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(b1==ae.getSource())
		{
			int x[]=p.p.p.p.p.a;
			int bday=x[4]*1+x[3]*2+x[2]*4+x[1]*8+x[0]*16;
			int y[]=p.p.p.p.p.b;
			int bmonth=y[4]*1+y[3]*2+y[2]*4+y[1]*8+y[0]*16;
			ta.setText("");
			if(bday==0||bmonth==0||bmonth>12)
			{
				ta.setText("   you are \n\n            not born \n\n              on \n\n                   valid date\n  Choosen...\n\n               "+ Integer.toString(bday)+" as date \n                     and  "+ Integer.toString(bmonth)+" as month  \n ");
			}
			else
			{
				String s;
				if(bmonth==1)
				{
					s="January";
				}
				else if(bmonth==2)
				{
					s="February";
				}
				else if(bmonth==3)
				{
					s="March";
				}
				else if(bmonth==4)
				{
					s="April";
				}
				else if(bmonth==5)
				{
					s="May";
				}
				else if(bmonth==6)
				{
					s="June";
				}
				else if(bmonth==7)
				{
					s="July";
				}
				else if(bmonth==8)
				{
					s="August";
				}
				else if(bmonth==9)
				{
					s="September";
				}
				else if(bmonth==10)
				{
					s="October";
				}
				else if(bmonth==11)
				{
					s="November";
				}
				else
				{
					s="December";
				}
				ta.append("Your \n\n         birthday \n\n              is\n\n                \" "+Integer.toString(bday)+"   "+s+" \"\n\n\n         THANK you!!!");
			}
		}
	}
}
