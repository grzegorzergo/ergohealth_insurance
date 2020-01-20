package DataFileReader;

import java.io.IOException;
import java.util.List;

public class ExcelFileReader {
    public static void main(String[] args) {

        //An index that specifies the column named 'xxx' in the worksheet
        int NameColumn = 0;
        int SecondNameColumn = 1;
        int BornDateColumn = 2;
        int EmailAddressColumn = 3;
        /*int CountryColumn = 4;*/
        int PostCodeColumn = 4;
        int CityColumn = 5;
        int StreetColumn = 6;
        int InsuranceNumberColumn = 7;

        //Index defining the column named Expected result in the worksheet
        int expectedResultNameColumn = 0;
        int expectedResultSecondNameColumn = 1;
        int expectedResultBornDateColumn = 2;
        int expectedResultEmailAddressColumn = 3;
        /*int expectedResultCountryColumn = 4;*/
        int expectedResultPostCodeColumn = 4;
        int expectedResultCityColumn = 5;
        int expectedResultStreetColumn = 6;
        int expectedResultInsuranceNumberColumn = 7;

        ExcelSheetReader excelSheetReader = new ExcelSheetReader();

        try {

            //Reading/downloading a file named FILE_NAME.xslx and a spreadsheet inside a file named FileName
            String excelFileLocation = System.getProperty("user.dir") + "/src/main/resources/" + "MOCK_DATA.xlsx";
            excelSheetReader.setExcelFileSheet(excelFileLocation, "data1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        SheetDataReader sheetDataReader = new SheetDataReader(excelSheetReader.getExcelSheet());
        List<String> NameList = sheetDataReader.getDataForColumn(NameColumn);
        List<String> SecondNameList = sheetDataReader.getDataForColumn(SecondNameColumn);
        List<String> BornDateList = sheetDataReader.getDataForColumn(BornDateColumn);
        List<String> EmailAddressList = sheetDataReader.getDataForColumn(EmailAddressColumn);
        /*List<String> CountryList = sheetDataReader.getDataForColumn(CountryColumn);*/
        List<String> PostCodeList = sheetDataReader.getDataForColumn(PostCodeColumn);
        List<String> CityList = sheetDataReader.getDataForColumn(CityColumn);
        List<String> StreetList = sheetDataReader.getDataForColumn(StreetColumn);
        List<String> InsuranceNumberList = sheetDataReader.getDataForColumn(InsuranceNumberColumn);



        System.out.println(NameList.toString());
        System.out.println(SecondNameList.toString());
        System.out.println(BornDateList.toString());
        System.out.println(EmailAddressList.toString());
        /*System.out.println(CountryList.toString());*/
        System.out.println(PostCodeList.toString());
        System.out.println(CityList.toString());
        System.out.println(StreetList.toString());
        System.out.println(InsuranceNumberList.toString());




        List<String> expectedResultNameList = sheetDataReader.getDataForColumn(expectedResultNameColumn);
        List<String> expectedResultSecondNameList = sheetDataReader.getDataForColumn(expectedResultSecondNameColumn);
        List<String> expectedResultBornDateList = sheetDataReader.getDataForColumn(expectedResultBornDateColumn);
        List<String> expectedResultEmailAddressList = sheetDataReader.getDataForColumn(expectedResultEmailAddressColumn);
     /*   List<String> expectedResultCountryList = sheetDataReader.getDataForColumn(expectedResultCountryColumn);*/
        List<String> expectedResultPostCodeList = sheetDataReader.getDataForColumn(expectedResultPostCodeColumn);
        List<String> expectedResultCityList = sheetDataReader.getDataForColumn(expectedResultCityColumn);
        List<String> expectedResultStreetList = sheetDataReader.getDataForColumn(expectedResultStreetColumn);
        List<String> expectedResultInsuranceNumberList = sheetDataReader.getDataForColumn(expectedResultInsuranceNumberColumn);


        System.out.println(expectedResultNameList.toString());
        System.out.println(expectedResultSecondNameList.toString());
        System.out.println(expectedResultBornDateList.toString());
        System.out.println(expectedResultEmailAddressList.toString());
       /* System.out.println(expectedResultCountryList.toString());*/
        System.out.println(expectedResultPostCodeList.toString());
        System.out.println(expectedResultCityList.toString());
        System.out.println(expectedResultStreetList.toString());
        System.out.println(expectedResultInsuranceNumberList.toString());
    }

}

