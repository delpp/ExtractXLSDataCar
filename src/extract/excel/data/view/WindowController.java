package extract.excel.data.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import extract.excel.data.model.DataSet;
import extract.excel.data.model.DataSetValues;
import extract.excel.data.model.DataSetWithColumn;
import extract.excel.data.model.XLSFileTools;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;


public class WindowController<T> {
	@FXML private TextField nazwaPliku;
	
	@FXML private CheckBox wlaczDaneTeksty;
	
	@FXML private Label zakladkaTekstyLabel;
	@FXML private Label kolumnaBeginLabel;
	@FXML private ChoiceBox<String> zakladkaTeksty;	
	@FXML private ChoiceBox<String> kolumnaBegin;
	
	
	@FXML private CheckBox wlaczDaneOdzywcze;
	
	@FXML private Label zakladkaOdzywczeLabel;
	@FXML private Label kolumna100gOdzywczeLabel;
	@FXML private Label kolumnaPortionOdzywczeLabel;
	@FXML private Label kolumnaRWSOdzywczeLabel;
	
	@FXML private Label naglowekWartosciOdzywczeLabel;
	@FXML private Label naglowekWierszOdzywczeLabel;
	@FXML private Label naglowek100gOdzywczeLabel;
	@FXML private Label naglowekPortionOdzywczeLabel;
	@FXML private Label naglowekRWSOdzywczeLabel;	
	
	@FXML private ChoiceBox<String> zakladkaWartosciOdzywcze;
	@FXML private ChoiceBox<String> kolumnaOdzywcze100g;
	@FXML private ChoiceBox<String> kolumnaOdzywczePortion;
	@FXML private ChoiceBox<String> kolumnaOdzywczeRWS;
		
	@FXML private ChoiceBox<String> kolumnaNazwaGlowna;
	@FXML private CheckBox nazwaGlownaChk;
	@FXML private TextField nazwaGlownaNr;
	@FXML private T nazwaGlownaDescription;
	
	
	@FXML private ChoiceBox<String> kolumnaWyrozniki;
	@FXML private CheckBox wyroznikiChk;
	@FXML private TextField wyroznikNr;
	@FXML private T wyroznikDescription1;
	@FXML private T wyroznikDescription2;
	@FXML private T wyroznikDescription3;	
	@FXML private T wyroznikDescription4;	
	
	
	@FXML private ChoiceBox<String> kolumnaPiktogramyFejs;
	@FXML private CheckBox piktogramyFejsChk;
	@FXML private TextField piktogramyFejsNr;
	@FXML private T piktogramFejsDescription1;
	@FXML private T piktogramFejsDescription2;
	@FXML private T piktogramFejsDescription3;
	
	
	@FXML private ChoiceBox<String> kolumnaNazwaOpisowa;
	@FXML private CheckBox nazwaOpisowaChk;
	@FXML private TextField nazwaOpisowaNr;
	@FXML private T nazwaOpisowaDescription;
	
	
	@FXML private ChoiceBox<String> kolumnaSkladniki;
	@FXML private CheckBox skladnikiChk;
	@FXML private TextField skladnikiNr;
	@FXML private T skladnikiDescription;
	
	@FXML private ChoiceBox<String> kolumnaDataINrPartii;
	@FXML private CheckBox dataINrPartiiChk;
	@FXML private TextField dataINrPartiiRowNr;
	@FXML private T dataINrPartiiDescription1;
	@FXML private T dataINrPartiiDescription2;
	
	
	@FXML private ChoiceBox<String> kolumnaSposobPrzechowywania;
	@FXML private CheckBox sposobPrzechowywaniaChk;
	@FXML private TextField sposobPrzechowywaniaRowNr;
	@FXML private T sposobPrzechowywaniaDescription;
	
	@FXML private ChoiceBox<String> kolumnaSposobPrzygotowania;
	@FXML private CheckBox sposobPrzygotowaniaChk;
	@FXML private TextField sposobPrzygotowaniaRowNr;
	@FXML private T sposobPrzygotowaniaDescription;

	@FXML private ChoiceBox<String> kolumnaProducent;
	@FXML private CheckBox producentChk;
	@FXML private TextField producentNr;
	@FXML private T producentDescription;
	
	
	@FXML private ChoiceBox<String> kolumnaGramatura;
	@FXML private CheckBox gramaturaChk;
	@FXML private TextField gramaturaNr;
	@FXML private T gramaturaDescription1;
	@FXML private T gramaturaDescription2;
	@FXML private T gramaturaDescription3;
	
	
	@FXML private ChoiceBox<String> kolumnaTypOpakowania;
	@FXML private CheckBox typOpakowaniaChk;
	@FXML private TextField typOpakowaniaNr;
	@FXML private T typOpakowaniaDescription1;
	@FXML private T typOpakowaniaDescription2;
	@FXML private T typOpakowaniaDescription3;
	@FXML private T typOpakowaniaDescription4;
	

//	@FXML private CheckBox wskazowkiChk;
//	@FXML private CheckBox krajPochodzeniaChk;

//	@FXML private CheckBox sposobUzyciaChk;
//	@FXML private CheckBox sposobPrzygotowaniaChk;
//	@FXML private CheckBox sposobPrzechowywaniaChk;
//	@FXML private CheckBox srodkiOstroznosciChk;
//	@FXML private CheckBox wyprodukowanoPrzezChk;
//	@FXML private CheckBox terminPrzydatnosciChk;
//	@FXML private CheckBox nrWeterynaryjnyChk;
//	@FXML private CheckBox nrPartiiChk;
	@FXML private CheckBox EANChk;

//	@FXML private TextField wskazowkiNr;

//	@FXML private TextField krajPochodzeniaNr;


//	@FXML private TextField sposobUzyciaNr;
//	@FXML private TextField sposobPrzygotowaniaNr;
//	@FXML private TextField sposobPrzechowywaniaNr;
//	@FXML private TextField srodkiOstroznosciNr;
//	@FXML private TextField wyprodukowanoPrzezNr;
//	@FXML private TextField terminPrzydatnosciNr;
//	@FXML private TextField nrWeterynaryjnyNr;
//	@FXML private TextField nrPartiiNr;
	@FXML private TextField EANNr;
	
		
//	@FXML private TextArea sposobUzyciaDescription;
//	@FXML private TextArea sposobPrzygotowaniaDescription;
//	@FXML private TextArea sposobPrzechowywaniaDescription;
//	@FXML private TextArea srodkiOstroznosciDescription;
//	@FXML private TextArea wyprodukowanoPrzezDescription;
//	@FXML private TextArea terminPrzydatnosciDescription;
//	@FXML private TextArea nrWeterynaryjnyDescription;
//	@FXML private TextArea nrPartiiDescription;
	@FXML private TextArea EANDescription;
	
	
	@FXML private CheckBox liczbaPorcjiChk;
	@FXML private ChoiceBox<String> kolumnaLiczbyPorcji;
	@FXML private Label kolumnaLiczbyPorcjiLabel;
	@FXML private Label liczbaPorcjiWierszLabel;
	@FXML private TextField liczbaPorcjiNr;
	@FXML private Label liczbaPorcjiLabel;
	@FXML private TextArea liczbaPorcjiDescription;
	
	@FXML private Label wielkoscPorcjiWierszLabel;
	@FXML private TextField wielkoscPorcjiNr;
	@FXML private Label wielkoscPorcjiLabel;
	@FXML private TextArea wielkoscPorcjiDescription;
	
	
	
	@FXML private Label energiakJNameLabel;
	@FXML private TextField energiakJNr;
	@FXML private TextField energiakJ100g;
	@FXML private TextField energiakJPortion;
	@FXML private TextField energiakJRWS;
	
	@FXML private Label energiakcalNameLabel;
	@FXML private TextField energiakcalNr;
	@FXML private TextField energiakcal100g;
	@FXML private TextField energiakcalPortion;
	@FXML private TextField energiakcalRWS;

	@FXML private Label tluszczeNameLabel;
	@FXML private TextField tluszczeNr;
	@FXML private TextField tluszcze100g;
	@FXML private TextField tluszczePortion;
	@FXML private TextField tluszczeRWS;
		
	@FXML private Label kwasyNameLabel;
	@FXML private TextField kwasyNr;
	@FXML private TextField kwasy100g;
	@FXML private TextField kwasyPortion;
	@FXML private TextField kwasyRWS;
	
	@FXML private Label weglowodanyNameLabel;
	@FXML private TextField weglowodanyNr;
	@FXML private TextField weglowodany100g;
	@FXML private TextField weglowodanyPortion;
	@FXML private TextField weglowodanyRWS;
	
	@FXML private Label cukryNameLabel;
	@FXML private TextField cukryNr;
	@FXML private TextField cukry100g;
	@FXML private TextField cukryPortion;
	@FXML private TextField cukryRWS;
	
	@FXML private Label blonnikNameLabel;
	@FXML private TextField blonnikNr;
	@FXML private TextField blonnik100g;
	@FXML private TextField blonnikPortion;
	@FXML private TextField blonnikRWS;
	
	@FXML private Label bialkoNameLabel;
	@FXML private TextField bialkoNr;
	@FXML private TextField bialko100g;
	@FXML private TextField bialkoPortion;
	@FXML private TextField bialkoRWS;
		
	@FXML private Label solNameLabel;
	@FXML private TextField solNr;
	@FXML private TextField sol100g;
	@FXML private TextField solPortion;
	@FXML private TextField solRWS;
	
	@FXML private Button saveDataFromTab1Btn;
	@FXML private Button loadDataFromTab1Btn;
	@FXML private Button saveDataFromTab2Btn;
	@FXML private Button loadDataFromTab2Btn;
	@FXML private Button applyColumnForAllColumns;
	
	
	
	@FXML private Tooltip pokazCalaSciezke;
	
	@FXML private Stage stage;
	
	private String path;
	private List<DataSet<T>> listDataSet;
	private List<DataSetValues> listDataSetOdzywcze;
	private List<DataSetWithColumn<T>> listDataPortion;

	private List<ChoiceBox<String>> listColumns;
	
	private boolean dataTekstyLoaded;
	private boolean dataOdzywczeLoaded;
	
	@SuppressWarnings("unchecked")
	@FXML private void initialize(){
		int beginColumnNumber = 1;
		path = "";
		dataTekstyLoaded = false;
		dataOdzywczeLoaded = false;
		
		ObservableList<String> columnsName = 
			    FXCollections.observableArrayList(
			        "A",
			        "B",
			        "C",
			        "D",
			        "E",
			        "F",
			        "G",
			        "H",
			        "I",
			        "J",
			        "K",
			        "L",
			        "M",
			        "N",
			        "O"
			    );
		
		ObservableList<String> columnsGramatura = 
			    FXCollections.observableArrayList(
			        "Masa - nie dotyczy",
			        "Masa netto:",
			        "Objętość netto:",
			        "Masa netto: (i) Masa netto po odcieku:"
			    );
		
		listColumns = new ArrayList<ChoiceBox<String>>();
		listColumns.add(kolumnaNazwaGlowna);
		listColumns.add(kolumnaWyrozniki);
		listColumns.add(kolumnaPiktogramyFejs);
		listColumns.add(kolumnaNazwaOpisowa);
		listColumns.add(kolumnaSkladniki);
		listColumns.add(kolumnaDataINrPartii);		
		listColumns.add(kolumnaSposobPrzechowywania);
		listColumns.add(kolumnaSposobPrzygotowania);
		listColumns.add(kolumnaProducent);
		listColumns.add(kolumnaGramatura);
		listColumns.add(kolumnaTypOpakowania);
		
		
		kolumnaBegin.getItems().addAll(columnsName);		
		kolumnaBegin.getSelectionModel().select(beginColumnNumber);
		
		
		listColumns.stream().forEach(x -> {
			x.getItems().addAll(columnsName);
			x.getSelectionModel().select(beginColumnNumber);
		});

		
		((ChoiceBox<String>) gramaturaDescription1).getItems().addAll(columnsGramatura);
		((ChoiceBox<String>) gramaturaDescription1).getSelectionModel().select(-1);
		
		kolumnaSposobPrzygotowania.getSelectionModel().select(3);
		kolumnaGramatura.getSelectionModel().select(0);
			
		kolumnaLiczbyPorcji.getItems().addAll(columnsName);
		kolumnaLiczbyPorcji.getSelectionModel().select(1);
	
		kolumnaOdzywcze100g.getItems().addAll(columnsName);
		kolumnaOdzywcze100g.getSelectionModel().select(1);
		kolumnaOdzywczePortion.getItems().addAll(columnsName);
		kolumnaOdzywczePortion.getSelectionModel().select(2);
		kolumnaOdzywczeRWS.getItems().addAll(columnsName);
		kolumnaOdzywczeRWS.getSelectionModel().select(3);
		
		listDataSet = new ArrayList<DataSet<T>>();
		listDataSet.add(new DataSet<T>("NAZWA PRODUKTU FEJS", nazwaGlownaChk, kolumnaNazwaGlowna, nazwaGlownaNr, nazwaGlownaDescription, 0, true));
		listDataSet.add(new DataSet<T>("WYROZNIK1", wyroznikiChk, kolumnaWyrozniki, wyroznikNr, wyroznikDescription1, 0, true));
		listDataSet.add(new DataSet<T>("WYROZNIK2", wyroznikiChk, kolumnaWyrozniki, wyroznikNr, wyroznikDescription2, 1, true));
		listDataSet.add(new DataSet<T>("WYROZNIK3", wyroznikiChk, kolumnaWyrozniki, wyroznikNr, wyroznikDescription3, 2, true));
		listDataSet.add(new DataSet<T>("WYROZNIK4", wyroznikiChk, kolumnaWyrozniki, wyroznikNr, wyroznikDescription4, 3, true));	
		listDataSet.add(new DataSet<T>("PIKTOGRAM1", piktogramyFejsChk, kolumnaPiktogramyFejs, piktogramyFejsNr, piktogramFejsDescription1, 0, true));
		listDataSet.add(new DataSet<T>("PIKTOGRAM2", piktogramyFejsChk, kolumnaPiktogramyFejs, piktogramyFejsNr, piktogramFejsDescription2, 1, true));
		listDataSet.add(new DataSet<T>("PIKTOGRAM3", piktogramyFejsChk, kolumnaPiktogramyFejs, piktogramyFejsNr, piktogramFejsDescription3, 2, true));
		listDataSet.add(new DataSet<T>("NAZWA OPISOWA", nazwaOpisowaChk, kolumnaNazwaOpisowa, nazwaOpisowaNr, nazwaOpisowaDescription, 0, true));
		listDataSet.add(new DataSet<T>("SKLADNIKI", skladnikiChk, kolumnaSkladniki, skladnikiNr, skladnikiDescription, 0, true));	
		listDataSet.add(new DataSet<T>("DATA1", dataINrPartiiChk, kolumnaDataINrPartii, dataINrPartiiRowNr, dataINrPartiiDescription1, 0, true));
		listDataSet.add(new DataSet<T>("DATA2", dataINrPartiiChk, kolumnaDataINrPartii, dataINrPartiiRowNr, dataINrPartiiDescription2, 2, true));		
		listDataSet.add(new DataSet<T>("SPOSOBPRZECHOWYWANIA", sposobPrzechowywaniaChk, kolumnaSposobPrzechowywania, sposobPrzechowywaniaRowNr, sposobPrzechowywaniaDescription, 0, true));
		listDataSet.add(new DataSet<T>("SPOSOBPRZYGOTOWANIA", sposobPrzygotowaniaChk, kolumnaSposobPrzygotowania, sposobPrzygotowaniaRowNr, sposobPrzygotowaniaDescription, 0, true));
		listDataSet.add(new DataSet<T>("PRODUCENT", producentChk, kolumnaProducent, producentNr, producentDescription, 0, true));
		listDataSet.add(new DataSet<T>("GRAMATURA1", gramaturaChk, kolumnaGramatura, gramaturaNr, gramaturaDescription1, 0, true));
		listDataSet.add(new DataSet<T>("GRAMATURA2", gramaturaChk, kolumnaGramatura, gramaturaNr, gramaturaDescription2, 1, true));
		listDataSet.add(new DataSet<T>("GRAMATURA3", gramaturaChk, kolumnaGramatura, gramaturaNr, gramaturaDescription3, 4, true));
		
		listDataSet.add(new DataSet<T>("PIKTOGRAMTYPOPAKOWANIA1", typOpakowaniaChk, kolumnaTypOpakowania, typOpakowaniaNr, typOpakowaniaDescription1, 0, true));
		listDataSet.add(new DataSet<T>("PIKTOGRAMTYPOPAKOWANIA2", typOpakowaniaChk, kolumnaTypOpakowania, typOpakowaniaNr, typOpakowaniaDescription2, 1, true));
		listDataSet.add(new DataSet<T>("PIKTOGRAMTYPOPAKOWANIA3", typOpakowaniaChk, kolumnaTypOpakowania, typOpakowaniaNr, typOpakowaniaDescription3, 2, true));
		listDataSet.add(new DataSet<T>("PIKTOGRAMTYPOPAKOWANIA4", typOpakowaniaChk, kolumnaTypOpakowania, typOpakowaniaNr, typOpakowaniaDescription4, 3, true));	
		
		
		
		//		listDataSet.add(new DataSet("WSKAZOWKI", wskazowkiChk, wskazowkiNr, wskazowkiDescription));
//		listDataSet.add(new DataSet("NAZWA PRODUKTU", nazwaTylChk, nazwaTylNr, nazwaTylDescription));
//		listDataSet.add(new DataSet("KRAJ POCHODZENIA", krajPochodzeniaChk, krajPochodzeniaNr, krajPochodzeniaDescription));
//		listDataSet.add(new DataSet("SKLADNIKI", skladnikiChk, skladnikiNr, skladnikiDescription));
//		//listDataSet.add(new DataSetTwoFields("Liczba porcji", liczbaPorcjiChk, liczbaPorcjiNr, liczbaPorcjiDescription, wielkoscPorcjiDescription));		
//		listDataSet.add(new DataSet("SPOSOB UZYCIA", sposobUzyciaChk, sposobUzyciaNr, sposobUzyciaDescription));
//		listDataSet.add(new DataSet("SPOSOB PRZYGOTOWANIA", sposobPrzygotowaniaChk, sposobPrzygotowaniaNr, sposobPrzygotowaniaDescription));
//		listDataSet.add(new DataSet("SPOSOB PRZECHOWYWANIA", sposobPrzechowywaniaChk, sposobPrzechowywaniaNr, sposobPrzechowywaniaDescription));		
//		listDataSet.add(new DataSet("SRODKI OSTROZNOSCI", srodkiOstroznosciChk, srodkiOstroznosciNr, srodkiOstroznosciDescription));		
//		listDataSet.add(new DataSet("PRODUCENT", wyprodukowanoPrzezChk, wyprodukowanoPrzezNr, wyprodukowanoPrzezDescription));
//		listDataSet.add(new DataSet("TERMIN PRZYDATNOSCI", terminPrzydatnosciChk, terminPrzydatnosciNr, terminPrzydatnosciDescription));
//		listDataSet.add(new DataSet("NUMER WET", nrWeterynaryjnyChk, nrWeterynaryjnyNr, nrWeterynaryjnyDescription));
//		listDataSet.add(new DataSet("Numer partii", nrPartiiChk, nrPartiiNr, nrPartiiDescription));
//		listDataSet.add(new DataSet("EAN", EANChk, EANNr, EANDescription));
		
		listDataPortion = new ArrayList<DataSetWithColumn<T>>();
		//listDataPortion.add(new DataSetWithColumn("LICZBA PORCJI", liczbaPorcjiChk, kolumnaLiczbyPorcji, 0, liczbaPorcjiNr, liczbaPorcjiDescription));
		//listDataPortion.add(new DataSetWithColumn("WIELKOSC PORCJI", liczbaPorcjiChk, kolumnaLiczbyPorcji, 0, wielkoscPorcjiNr, wielkoscPorcjiDescription));
				
		listDataSetOdzywcze = new ArrayList<DataSetValues>();
		listDataSetOdzywcze.add(new DataSetValues("E1", "PE1", "R1", energiakJNameLabel, energiakJNr, energiakJ100g, energiakJPortion, energiakJRWS));
		listDataSetOdzywcze.add(new DataSetValues("E2", "PE2", "R2", energiakcalNameLabel, energiakcalNr, energiakcal100g, energiakcalPortion));
		listDataSetOdzywcze.add(new DataSetValues("T1", "PT1", "R3", tluszczeNameLabel, tluszczeNr, tluszcze100g, tluszczePortion, tluszczeRWS));
		listDataSetOdzywcze.add(new DataSetValues("T2", "PT2", "R4", kwasyNameLabel, kwasyNr, kwasy100g, kwasyPortion, kwasyRWS));
		listDataSetOdzywcze.add(new DataSetValues("W", "PW", "R5", weglowodanyNameLabel, weglowodanyNr, weglowodany100g, weglowodanyPortion, weglowodanyRWS));
		listDataSetOdzywcze.add(new DataSetValues("C", "PC", "R6", cukryNameLabel, cukryNr, cukry100g, cukryPortion, cukryRWS));
		listDataSetOdzywcze.add(new DataSetValues("BL", "PBL", "R7", blonnikNameLabel, blonnikNr, blonnik100g, blonnikPortion, blonnikRWS));
		listDataSetOdzywcze.add(new DataSetValues("BI", "PBI", "R8", bialkoNameLabel, bialkoNr, bialko100g, bialkoPortion, bialkoRWS));
		listDataSetOdzywcze.add(new DataSetValues("S", "PS", "R9", solNameLabel, solNr, sol100g, solPortion, solRWS));
		
		// disable/enable fields on Tab1
		wlaczDaneTeksty.setDisable(true);
		zakladkaTekstyLabel.setDisable(true);
		kolumnaBeginLabel.setDisable(true);		
		zakladkaTeksty.setDisable(true);
		kolumnaBegin.setDisable(true);
		applyColumnForAllColumns.setDisable(true);
		saveDataFromTab1Btn.setDisable(true);
		loadDataFromTab1Btn.setDisable(true);

		
		kolumnaLiczbyPorcjiLabel.setDisable(true);
		kolumnaLiczbyPorcji.setDisable(true);
		
		liczbaPorcjiLabel.setDisable(true);
		liczbaPorcjiWierszLabel.setDisable(true);	
		wielkoscPorcjiLabel.setDisable(true);
		wielkoscPorcjiWierszLabel.setDisable(true);
		
		for (DataSetWithColumn dataSet: listDataPortion) {
			dataSet.setDisableCheckBox(true);
			dataSet.setDisableTextFieldNr(true);
			dataSet.setDisableFieldDescription(true);
		}
		
		wlaczDaneOdzywcze.setDisable(true);
		zakladkaOdzywczeLabel.setDisable(true);
		kolumna100gOdzywczeLabel.setDisable(true);
		kolumnaPortionOdzywczeLabel.setDisable(true);
		kolumnaRWSOdzywczeLabel.setDisable(true);
		
		zakladkaWartosciOdzywcze.setDisable(true);
		kolumnaOdzywcze100g.setDisable(true);
		kolumnaOdzywczePortion.setDisable(true);
		kolumnaOdzywczeRWS.setDisable(true);
		
		naglowekWartosciOdzywczeLabel.setDisable(true);
		naglowekWierszOdzywczeLabel.setDisable(true);
		naglowek100gOdzywczeLabel.setDisable(true);
		naglowekPortionOdzywczeLabel.setDisable(true);
		naglowekRWSOdzywczeLabel.setDisable(true);
		
		saveDataFromTab2Btn.setDisable(true);
		loadDataFromTab2Btn.setDisable(true);	
		
		for (DataSetValues dataSet : listDataSetOdzywcze) {
			
			dataSet.setDisableLabelName(true);
			dataSet.setDisableTextFieldRowNumber(true);
			dataSet.setDisableTextFieldFor100g(true);
			dataSet.setDisableTextFieldForPortion(true);
			dataSet.setDisableTextFieldRWS(true);
		}
	}
	
	private ObservableList<String> loadDataColumnFromExcel(String textToSearch, int numberRowsToLoad, int shiftColumnToSearch) throws Exception {
		int sheetNumber = 0;			
		int maxColumnNumberToSearch = 15;	// 15 - P	
		int maxRowNumberToSearch = 50;
		
		int startColumnNumber = -1;
		int startRowNumber = -1;
		
		boolean found = false;
		
		for (int columnNumber = 0; columnNumber <= maxColumnNumberToSearch; columnNumber++) {
			for (int rowNumber = 0; rowNumber <= maxRowNumberToSearch; rowNumber++) {
				if (XLSFileTools.readCell(path, rowNumber, sheetNumber, columnNumber, false).equals(textToSearch)) {
					startColumnNumber = columnNumber;
					startRowNumber = rowNumber;
					found = true;
				}
				if (found) break;
			}	
			if (found) break;
		}
		
		List<String> list = new ArrayList<String>();
		if ((startColumnNumber > -1) && (startRowNumber > -1))
			for (int rowNumber = startRowNumber + 1; rowNumber <= startRowNumber + numberRowsToLoad; rowNumber++) {
				list.add(XLSFileTools.readCell(path, rowNumber, sheetNumber, startColumnNumber + shiftColumnToSearch, false));
			}
		
		
		System.out.println("lista: " + list);
		return FXCollections.observableArrayList(list);
	}
	
	@SuppressWarnings("unchecked")
	@FXML private void setFile() throws Exception{
				
		final FileChooser fileChooser = new FileChooser();
		fileChooser.setInitialDirectory(new File(System
				.getProperty("user.home")));
		fileChooser.getExtensionFilters().add(new ExtensionFilter("XLS Files", "*.xls", "*.XLS"));
		
		final File file = fileChooser.showOpenDialog(stage);
		
		if (file != null)
		try{
			wlaczDaneTeksty.setDisable(false);
			wlaczDaneOdzywcze.setDisable(false);
			
			path = file.getAbsolutePath();
			
			zakladkaTeksty.getItems().clear();
			zakladkaWartosciOdzywcze.getItems().clear();
			loadSheetsNames(path);
			
			pokazCalaSciezke.setText(path);
	
			nazwaPliku.setText(path);
						
			if (piktogramFejsDescription1 instanceof ChoiceBox) {
				((ChoiceBox<String>) piktogramFejsDescription1).getItems().addAll(loadDataColumnFromExcel("NUTRISCORE", 6, 0));
				((ChoiceBox<String>) piktogramFejsDescription1).getSelectionModel().select(-1);
			}
			
			
			ObservableList<String> listaPiktogramyFejs = loadDataColumnFromExcel("PIKTOGRAMY", 7, 0);			
			if (piktogramFejsDescription2 instanceof ChoiceBox) {
				((ChoiceBox<String>) piktogramFejsDescription2).getItems().addAll(listaPiktogramyFejs);
				((ChoiceBox<String>) piktogramFejsDescription2).getSelectionModel().select(-1);
			}			
			if (piktogramFejsDescription3 instanceof ChoiceBox) {
				((ChoiceBox<String>) piktogramFejsDescription3).getItems().addAll(listaPiktogramyFejs);
				((ChoiceBox<String>) piktogramFejsDescription3).getSelectionModel().select(-1);
			}
			
			
			if (dataINrPartiiDescription1 instanceof ChoiceBox) {
				((ChoiceBox<String>) dataINrPartiiDescription1).getItems().addAll(loadDataColumnFromExcel("Termin przydatności", 4, 0));
				((ChoiceBox<String>) dataINrPartiiDescription1).getSelectionModel().select(-1);
			}		
			

			ObservableList<String> listaTypOpakowaniaFejs = loadDataColumnFromExcel("MATERIAŁ", 33, 1);
			if (typOpakowaniaDescription1 instanceof ChoiceBox) {
				((ChoiceBox<String>) typOpakowaniaDescription1).getItems().addAll(listaTypOpakowaniaFejs);
				((ChoiceBox<String>) typOpakowaniaDescription1).getSelectionModel().select(-1);
			}
			if (typOpakowaniaDescription2 instanceof ChoiceBox) {
				((ChoiceBox<String>) typOpakowaniaDescription2).getItems().addAll(listaTypOpakowaniaFejs);
				((ChoiceBox<String>) typOpakowaniaDescription2).getSelectionModel().select(-1);
			}
			if (typOpakowaniaDescription3 instanceof ChoiceBox) {
				((ChoiceBox<String>) typOpakowaniaDescription3).getItems().addAll(listaTypOpakowaniaFejs);
				((ChoiceBox<String>) typOpakowaniaDescription3).getSelectionModel().select(-1);
			}
			if (typOpakowaniaDescription4 instanceof ChoiceBox) {
				((ChoiceBox<String>) typOpakowaniaDescription4).getItems().addAll(listaTypOpakowaniaFejs);
				((ChoiceBox<String>) typOpakowaniaDescription4).getSelectionModel().select(-1);
			}
			
			
			
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	@FXML private void loadDataTab1() throws Exception {
		
		int sheetNumber = zakladkaTeksty.getSelectionModel().getSelectedIndex();			
		int columnNumber;		
		int rowNumber;		
		String daneProduktu;
		
		for (DataSet<T> dataSet : listDataSet) {
		
			if (dataSet.isSelectedCheckBox()) {
				rowNumber = dataSet.getRowNumber();
				if (rowNumber < 1) daneProduktu = "-";
				else {
					rowNumber = rowNumber - 1;
					columnNumber = dataSet.getColumnNumber();
					daneProduktu = XLSFileTools.readCell(path, rowNumber, sheetNumber, columnNumber, true);
					
					//XLSFileTools.readCell – uwzględnić info (dodane w konstruktorze), aby brał tekst bez formatowania (np. boldów)
				}
			}
			else 
				daneProduktu = dataSet.readDescription();
						
			System.out.println("daneProduktu: " + daneProduktu);
			dataSet.writeDesctription(daneProduktu);
		}
				
		saveDataFromTab1Btn.setDisable(false);		
		dataTekstyLoaded = true;		
	}
	
	@FXML private void loadDataTab2() throws Exception {
		
		int sheetNumber = zakladkaWartosciOdzywcze.getSelectionModel().getSelectedIndex();
		final int columnNumber = kolumnaLiczbyPorcji.getSelectionModel().getSelectedIndex();
		int rowNumber;
		
		listDataPortion.stream().forEach(x -> {
			//x.setRowNumber();
			x.setColumnNumber(columnNumber);
		});
			
		String daneProduktu;
		for (DataSetWithColumn<T> dataSet : listDataPortion) {
			if (dataSet.isSelectedCheckBox())
				if (dataSet.getRowNumber() < 1) daneProduktu = "-";
				else {
					rowNumber = dataSet.getRowNumber()-1;
					System.out.println("Kolumna: " + columnNumber + ", wiersz: " + rowNumber);
					
					daneProduktu = XLSFileTools.readCell(path, rowNumber, sheetNumber, columnNumber, true);
				}
			else 
				daneProduktu = dataSet.readDescription();
						
			dataSet.writeDesctription(daneProduktu);
		}
		
		listDataSetOdzywcze.stream().forEach(x -> x.setRowNumber());
		
	
		System.out.println("Sheet number: " + sheetNumber);

		ArrayList<ChoiceBox<String>> columns = new ArrayList<ChoiceBox<String>>();
		
		columns.add(kolumnaOdzywcze100g);
		columns.add(kolumnaOdzywczePortion);
		columns.add(kolumnaOdzywczeRWS);
		
		//String daneProduktu;
		
		for (ChoiceBox<String> choosedColumn : columns) {
			int columnNumberOdzywcze = choosedColumn.getSelectionModel().getSelectedIndex();
			System.out.println("kolumna number: " + columnNumberOdzywcze);
			
			for (DataSetValues dataSetValues : listDataSetOdzywcze) {
				if (dataSetValues.getRowNumber() < 1) daneProduktu = "-";
				else {
					rowNumber = dataSetValues.getRowNumber()-1;						
					daneProduktu = XLSFileTools.readCell(path, rowNumber, sheetNumber, columnNumberOdzywcze, true);
					daneProduktu = daneProduktu.replace(".", ",");
					
				}
			dataSetValues.writeToTextField(daneProduktu, dataSetValues.getTextFieldDescription(choosedColumn.getId()));
			}			
		}
				
		saveDataFromTab2Btn.setDisable(false);
		
		dataOdzywczeLoaded = true;
	}
	
	@FXML private void writeData() throws Exception{		
		ArrayList<String> textNameRows = new ArrayList<String>();
		ArrayList<String> dataProduct = new ArrayList<String>();
		ArrayList<ChoiceBox<String>> columns = new ArrayList<ChoiceBox<String>>();	
		columns.add(kolumnaOdzywcze100g);
		columns.add(kolumnaOdzywczePortion);
		columns.add(kolumnaOdzywczeRWS);
		
		for (DataSet dataSet : listDataSet) {
			textNameRows.add(dataSet.getName());
		}
		
		for (DataSetWithColumn dataSet : listDataPortion) {
			textNameRows.add(dataSet.getName());
		}
		
		
		for (DataSetValues dataSet : listDataSetOdzywcze) {
			textNameRows.add(dataSet.nameFor100g());
		}
		
		for (DataSetValues dataSet : listDataSetOdzywcze) {
			textNameRows.add(dataSet.nameForPortion());
		}
		
		for (DataSetValues dataSet : listDataSetOdzywcze) {
			textNameRows.add(dataSet.nameForRWS());
		}
		

		for (DataSet dataSet : listDataSet) {
			if (dataSet.isSelectedCheckBox()) {				
				dataProduct.add(dataSet.readDescriptionToSaveData());
			}
			else {
				dataProduct.add("-");
			}
		}
		
		for (DataSetWithColumn dataSet : listDataPortion) {
			if (dataSet.isSelectedCheckBox())
				if (dataSet.readDescription().equals("")) dataProduct.add("-");
				else dataProduct.add(dataSet.readDescription());
			else dataProduct.add("-");
		}

		
		for (ChoiceBox<String> choosedColumn : columns) {
			for (DataSetValues dataSet : listDataSetOdzywcze) {

				if (dataSet.readTextField(choosedColumn.getId()).equals(""))
					dataProduct.add("-");
					
				else dataProduct.add(dataSet.readTextField(choosedColumn.getId()));				 
			}
		}
		
		String textNamesRow = arrayToString(textNameRows);
		
		String textDataRow = arrayToString(dataProduct);
		
		String dataToWrite = textNamesRow + "\nnnnnn" + textDataRow;

		System.out.println("Dane pełne:" + dataToWrite);
		
		XLSFileTools.saveFile(path.replaceAll(".xls",  ".txt"), dataToWrite);
	}
		
	public static String arrayToString(ArrayList<String> data) {
		StringBuilder outputText = new StringBuilder();
		for (int i = 0; i < data.size(); i++){					
			outputText.append(data.get(i)).append("\t");
		}
		return outputText.toString();
	}
	
	@FXML private void enableDisableFieldsTeksty() {
		if (wlaczDaneTeksty.isSelected()) {
			zakladkaTekstyLabel.setDisable(false);
			zakladkaTeksty.setDisable(false);
			
			kolumnaBeginLabel.setDisable(false);
			kolumnaBegin.setDisable(false);
			
			applyColumnForAllColumns.setDisable(false);
		
			loadDataFromTab1Btn.setDisable(false);
			
			wielkoscPorcjiLabel.setDisable(false);
			
			if (dataTekstyLoaded) saveDataFromTab1Btn.setDisable(false);

			for (DataSet<T> dataSet : listDataSet) {
				dataSet.setDisableCheckBox(false);
				if (dataSet.isSelectedCheckBox()) {
					dataSet.setDisableTextFieldNr(false);
					dataSet.setDisableFieldDescription(false);
					dataSet.setDisableColumnNumber(false);
				}
				else {
					dataSet.setDisableTextFieldNr(true);
					dataSet.setDisableFieldDescription(true);
					dataSet.setDisableColumnNumber(true);
				}
			}
		}
		else {
			zakladkaTekstyLabel.setDisable(true);
			zakladkaTeksty.setDisable(true);
			
			kolumnaBeginLabel.setDisable(true);
			kolumnaBegin.setDisable(true);
			
			applyColumnForAllColumns.setDisable(true);
			
			saveDataFromTab1Btn.setDisable(true);
			loadDataFromTab1Btn.setDisable(true);
			
			wielkoscPorcjiLabel.setDisable(true);
			
			for (DataSet<T> dataSet : listDataSet) {
				dataSet.setDisableCheckBox(true);
				dataSet.setDisableTextFieldNr(true);
				dataSet.setDisableFieldDescription(true);
				dataSet.setDisableColumnNumber(true);
			}
		}
	}

	@FXML private void enableDisableFieldsOdzywcze() {
		if (wlaczDaneOdzywcze.isSelected()) {
			
			liczbaPorcjiChk.setDisable(false);
			
			zakladkaOdzywczeLabel.setDisable(false);
			zakladkaWartosciOdzywcze.setDisable(false);
			
			kolumna100gOdzywczeLabel.setDisable(false);
			kolumnaPortionOdzywczeLabel.setDisable(false);
			kolumnaRWSOdzywczeLabel.setDisable(false);
			kolumnaOdzywcze100g.setDisable(false);
			kolumnaOdzywczePortion.setDisable(false);
			kolumnaOdzywczeRWS.setDisable(false);
			
			naglowekWartosciOdzywczeLabel.setDisable(false);
			naglowekWierszOdzywczeLabel.setDisable(false);
			naglowek100gOdzywczeLabel.setDisable(false);
			naglowekPortionOdzywczeLabel.setDisable(false);
			naglowekRWSOdzywczeLabel.setDisable(false);
			
			loadDataFromTab2Btn.setDisable(false);
			
			if (dataOdzywczeLoaded) saveDataFromTab2Btn.setDisable(false);
			
			for (DataSetValues dataSet : listDataSetOdzywcze) {
				
				dataSet.setDisableLabelName(false);
				dataSet.setDisableTextFieldRowNumber(false);
				dataSet.setDisableTextFieldFor100g(false);
				dataSet.setDisableTextFieldForPortion(false);
				dataSet.setDisableTextFieldRWS(false);
			}
		}
		else {
			zakladkaOdzywczeLabel.setDisable(true);
			zakladkaWartosciOdzywcze.setDisable(true);
			
			liczbaPorcjiChk.setDisable(true);
			
			kolumna100gOdzywczeLabel.setDisable(true);
			kolumnaPortionOdzywczeLabel.setDisable(true);
			kolumnaRWSOdzywczeLabel.setDisable(true);
			kolumnaOdzywcze100g.setDisable(true);
			kolumnaOdzywczePortion.setDisable(true);
			kolumnaOdzywczeRWS.setDisable(true);
			
			naglowekWartosciOdzywczeLabel.setDisable(true);
			naglowekWierszOdzywczeLabel.setDisable(true);
			naglowek100gOdzywczeLabel.setDisable(true);
			naglowekPortionOdzywczeLabel.setDisable(true);
			naglowekRWSOdzywczeLabel.setDisable(true);
			
			saveDataFromTab2Btn.setDisable(true);
			loadDataFromTab2Btn.setDisable(true);
			
			for (DataSetValues dataSet : listDataSetOdzywcze) {
				dataSet.setDisableLabelName(true);
				dataSet.setDisableTextFieldRowNumber(true);
				dataSet.setDisableTextFieldFor100g(true);
				dataSet.setDisableTextFieldForPortion(true);
				dataSet.setDisableTextFieldRWS(true);
			}
		}
	}
	
	@FXML private void enableDisableTextFields(){
		if (wlaczDaneTeksty.isSelected())
		for (DataSet<T> dataSet : listDataSet) {
			if (dataSet.isSelectedCheckBox()) {
				dataSet.setDisableTextFieldNr(false);
				dataSet.setDisableFieldDescription(false);
				dataSet.setDisableColumnNumber(false);
			}
			else {
				dataSet.setDisableTextFieldNr(true);
				dataSet.setDisableFieldDescription(true);
				dataSet.setDisableColumnNumber(true);
			}
		}
		
		if (liczbaPorcjiChk.isSelected()) {
			kolumnaLiczbyPorcjiLabel.setDisable(false);
			kolumnaLiczbyPorcji.setDisable(false);
			
			liczbaPorcjiLabel.setDisable(false);
			liczbaPorcjiWierszLabel.setDisable(false);
			wielkoscPorcjiLabel.setDisable(false);
			wielkoscPorcjiWierszLabel.setDisable(false);
			
			listDataPortion.stream().forEach(x -> {
				x.setDisableTextFieldNr(false);
				x.setDisableFieldDescription(false);
			});

		}
		else {
			kolumnaLiczbyPorcjiLabel.setDisable(true);
			kolumnaLiczbyPorcji.setDisable(true);
			
			liczbaPorcjiLabel.setDisable(true);
			liczbaPorcjiWierszLabel.setDisable(true);
			wielkoscPorcjiLabel.setDisable(true);
			wielkoscPorcjiWierszLabel.setDisable(true);	

			listDataPortion.stream().forEach(x -> {
				x.setDisableTextFieldNr(true);
				x.setDisableFieldDescription(true);
			});
		}
	}
	
	@FXML private void applyColumns() {
		
	}
	
	private void loadSheetsNames(String path) {
		ObservableList<String> sheetsNames = XLSFileTools.loadSheetsNames(path);
		zakladkaTeksty.getItems().addAll(sheetsNames);		
		zakladkaTeksty.getSelectionModel().select(0);
		zakladkaWartosciOdzywcze.getItems().addAll(sheetsNames);
		
		if (sheetsNames.size() > 1) 
			zakladkaWartosciOdzywcze.getSelectionModel().select(1);
		else 
			zakladkaWartosciOdzywcze.getSelectionModel().select(0);
	}
}


