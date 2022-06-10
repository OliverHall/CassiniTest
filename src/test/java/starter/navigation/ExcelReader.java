package starter.navigation;

		import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import org.apache.poi.xssf.usermodel.XSSFCell;
        import org.apache.poi.xssf.usermodel.XSSFRow;
        import org.apache.poi.xssf.usermodel.XSSFSheet;
        import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    private static XSSFSheet ExcelWSheet;

    private static XSSFWorkbook ExcelWBook;

    private static XSSFCell Cell;

    private static XSSFRow Row;

    public void callDefaults(){

        try {
            getTableArray("src/test/resources/files/Credentials.xlsx","Credentials",1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getUsername(){
        try {
            return getCellData(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ERROR";
    }

    public String getPassword(){
        try {
            return getCellData(1,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ERROR";
    }

    public static void setExcelFile(String Path,String SheetName) throws Exception {

        try {

            FileInputStream ExcelFile = new FileInputStream(Path);

            ExcelWBook = new XSSFWorkbook(ExcelFile);

            ExcelWSheet = ExcelWBook.getSheet(SheetName);

        } catch (Exception e){

            throw (e);

        }

    }

    public static Object[][] getTableArray(String FilePath, String SheetName, int iTestCaseRow)    throws Exception

    {

        String[][] tabArray = null;

        try{

            FileInputStream ExcelFile = new FileInputStream(FilePath);

            ExcelWBook = new XSSFWorkbook(ExcelFile);

            ExcelWSheet = ExcelWBook.getSheet(SheetName);

            int startCol = 0;

            int ci=0,cj=0;

            int totalRows = 1;

            int totalCols = 2;

            tabArray=new String[totalRows][totalCols];


        }

        catch (FileNotFoundException e)

        {

            System.out.println("Could not read the Excel sheet");

            e.printStackTrace();

        }

        catch (IOException e)

        {

            System.out.println("Could not read the Excel sheet");

            e.printStackTrace();

        }

        return(tabArray);

    }


    public static String getCellData(int RowNum, int ColNum) throws Exception{

        try{

            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

            String CellData = Cell.getStringCellValue();

            return CellData;

        }catch (Exception e){

            return"";

        }

    }



    public static int getRowContains(String sTestCaseName, int colNum) throws Exception{

        int i;

        try {

            int rowCount = getRowUsed();

            for ( i=0 ; i<rowCount; i++){

                if  (getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){

                    break;

                }

            }

            return i;

        }catch (Exception e){

            throw(e);

        }

    }

    public static int getRowUsed() throws Exception {

        try{

            int RowCount = ExcelWSheet.getLastRowNum();

            return RowCount;

        }catch (Exception e){

            System.out.println(e.getMessage());

            throw (e);

        }

    }

}
