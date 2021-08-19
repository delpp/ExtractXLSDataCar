package extract.excel.data.model;

import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DataSetTwoFields<T> extends DataSet<T>{
	private TextArea textArea2Description;
	
	public DataSetTwoFields(
			String name, 
			CheckBox checkBox, 
			ChoiceBox<String> kolumnNumber,
			TextField textFieldNr, 
			T textFieldDescription,
			TextArea textArea2Description) {
		super(name, checkBox, kolumnNumber, textFieldNr, textFieldDescription, 0, true);
		this.textArea2Description = textArea2Description;
	}
	
	public void setDisableFieldDescription(boolean disable) {
		super.setDisableFieldDescription(disable);
		
		textArea2Description.setDisable(disable);
	}

	public String readDescription() {
		String joinedString = super.readDescription() 
				+ "\t"
				+ textArea2Description.getText();
		
		return joinedString;
	}
		
	public void writeDesctription(String description) {
		
		String[] descriptionParts = description.split("\t", -1);	
		
		super.writeDesctription(descriptionParts[0]);		
		textArea2Description.setText(descriptionParts[1]);
	}
	
	
}
