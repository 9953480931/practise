package jtable;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class PersonTableModel extends AbstractTableModel  {
	
	String [] col = {"ID","name","age","country","status"};
	
	List<Person> list = new ArrayList<Person>();
	
	JTable jtable;
	
 public PersonTableModel() {
	
}

	public PersonTableModel(List<Person> list , JTable jtable) {
		super();
		this.list=list;
		this.jtable = jtable;
	}

	@Override
	public int getRowCount() {
	//	System.out.println("Get row count " +list.size());
		return list.size();
	}

	@Override
	public int getColumnCount() {
		
	//	System.out.println("Get col count " +col.length);
		return col.length;
	}
	
	public String getColumnName(int column) {
     //   System.out.println("Get col "+ col[column]);
        return col[column];
    }
     
    public Class getColumnClass(int column) {
    //	System.out.println("Get col class "+getValueAt(0, column).getClass());
        return getValueAt(0, column).getClass();
    }

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		//System.out.println("In person mode get "+ rowIndex  +"   "+ columnIndex);
		Object returnValue = null;
        Person person = list.get(rowIndex);
         
        switch (columnIndex) {
        case 0:
                returnValue = rowIndex + 1;
            break;
        case 1:
                returnValue = person.getName();
               
            break;
        case 2:
        	returnValue = person.getAge();
        	//System.out.println(person.getAge());
            break;
        case 3:
        	returnValue = person.getCountry();
        	System.out.println("checking bool  for india  "+returnValue);
        	if(returnValue.equals("India")){
        		jtable.setBackground(Color.RED);
        	}
        	else if(returnValue.equals("USA")){
        		jtable.setBackground(Color.orange);
        	}
        	else if(returnValue.equals("Canada")){
        		jtable.setBackground(Color.CYAN);
        	}
        	//System.out.println(person.getCountry());
            break;
        case 4:
        	returnValue = person.isFlag();
            break;
        }
        return returnValue;
	}
	
	@Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
		System.out.println("In person mode set "+value+"   "+ rowIndex  +"   "+ columnIndex);
        Person person = list.get(rowIndex);
         
        switch (columnIndex) {
        case 1:
                person.setName((String) value);
            break;
        case 2:
        	 person.setAge((String) value);
            break;
        case 3:
        	  person.setCountry((Country) value);   
            break;
        case 4:
      	  person.setFlag((boolean)value);   
          break;
        }      
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 0;
    }  

}
