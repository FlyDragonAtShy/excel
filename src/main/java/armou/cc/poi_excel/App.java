package armou.cc.poi_excel;

import armou.cc.poi_excel.entity.DnaBusinessDirectoryDTO;
import armou.cc.poi_excel.util.ExcelUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*List<ExcelDTO> excelDemos = ExcelUtils.readExcel("C:\\Users\\67555\\Downloads\\excelTest.xlsx", ExcelDTO.class);
    	excelDemos.stream().distinct().forEach(b->System.out.println(JSON.toJSONString(b, true)));*/

    	List<DnaBusinessDirectoryDTO> dnaBusinessDirectoryDTOList = new ArrayList<>();
        dnaBusinessDirectoryDTOList.add(new DnaBusinessDirectoryDTO().setBusHandDepart("1").setBusHandOffice("1").setResId("1"));
        dnaBusinessDirectoryDTOList.add(new DnaBusinessDirectoryDTO().setBusHandDepart("1").setBusHandOffice("1").setResId("2"));
        dnaBusinessDirectoryDTOList.add(new DnaBusinessDirectoryDTO().setBusHandDepart("1").setBusHandOffice("1").setResId("3"));
        dnaBusinessDirectoryDTOList.add(new DnaBusinessDirectoryDTO().setBusHandDepart("2").setBusHandOffice("2").setResId("1"));
        dnaBusinessDirectoryDTOList.add(new DnaBusinessDirectoryDTO().setBusHandDepart("3").setBusHandOffice("2").setResId("1"));
        dnaBusinessDirectoryDTOList.add(new DnaBusinessDirectoryDTO().setBusHandDepart("3").setBusHandOffice("2").setResId("1"));
        ExcelUtils.writeExcel("D:\\data\\业务目录.xls", dnaBusinessDirectoryDTOList, DnaBusinessDirectoryDTO.class,"业务目录", new Integer[]{0}, new Integer[]{0,1});
    }
}
