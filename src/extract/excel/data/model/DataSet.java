package extract.excel.data.model;

import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DataSet<T>{
	private String name;
	private CheckBox checkBox;
	private ChoiceBox<String> columnNumber;
	private TextField rowNumber;
	private T description;
	private int shiftColumn;
	
	public DataSet() {
		
	}
	
	@SuppressWarnings("unchecked")
	public DataSet(
			String name, 
			CheckBox checkBox, 
			ChoiceBox<String> columnNumber,
			TextField rowNumber, 
			T description,
			int shiftColumn,
			boolean notVisible) {
		this.name = name;
		this.columnNumber = columnNumber;
		this.checkBox = checkBox;
		this.rowNumber = rowNumber;
		this.description = description;
		this.shiftColumn = shiftColumn;
		
		checkBox.setDisable(notVisible);
		columnNumber.setDisable(notVisible);
		rowNumber.setDisable(notVisible);
		if (description instanceof TextArea) ((TextArea) description).setDisable(notVisible);
		if (description instanceof ChoiceBox) ((ChoiceBox<String>) description).setDisable(notVisible);
		checkBox.setSelected(true);
	}
	
	
	
	public boolean isDisableCheckBox() {
		return checkBox.isDisable();
	}
	public void setDisableCheckBox(boolean disable) {
		checkBox.setDisable(disable);
	}
	public boolean isSelectedCheckBox() {
		return checkBox.isSelected();
	}
	public void selectCheckBox() {
		checkBox.setSelected(true);
	}
	
	
	
	public boolean isDisableTextFieldNr() {
		return rowNumber.isDisable();
	}
	public void setDisableTextFieldNr(boolean disable) {
		rowNumber.setDisable(disable);
	}
	
	
	public void setDisableColumnNumber(boolean disable) {
		columnNumber.setDisable(disable);
	}
	

	public void setDisableFieldDescription(boolean disable) {
		if (description instanceof TextArea) ((TextArea) description).setDisable(disable);
		if (description instanceof ChoiceBox) ((ChoiceBox<String>) description).setDisable(disable);
	}

	public String readDescription() {
		if (description instanceof TextArea) return ((TextArea) description).getText();
		if (description instanceof ChoiceBox) return Integer.toString(((ChoiceBox<String>) description).getSelectionModel().getSelectedIndex()+1);
		
		return "";
	}
	
	@SuppressWarnings("unchecked")
	public String readDescriptionToSaveData() {
		if (description instanceof TextArea) return ((TextArea) description).getText();
		if (description instanceof ChoiceBox) return ((ChoiceBox<String>) description).getValue();
		
		return "";
	}

	
	public int getRowNumber() {
		if ((!rowNumber.getText().equals("")) && (isSelectedCheckBox())) 
			return Integer.parseInt(rowNumber.getText());
		else return 0;
	}
	
	public int getColumnNumber() {
		return columnNumber.getSelectionModel().getSelectedIndex() + shiftColumn;
	}
	
	
	@SuppressWarnings("unchecked")
	public void writeDesctription(String descriptionText) {	
		System.out.println("descriptionText dla " + name + ": " + descriptionText);
		if (description instanceof TextArea) ((TextArea) description).setText(descriptionText);
		if (description instanceof ChoiceBox) {
			try {
				((ChoiceBox<String>) description).getSelectionModel().select(Integer.parseInt(descriptionText)-1);
			}
			catch (Exception ex) {
				
			}
		}
	}
	
	public String getName() {
		return name;
	}

}
