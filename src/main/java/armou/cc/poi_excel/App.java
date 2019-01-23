package armou.cc.poi_excel;

import java.util.List;

import com.alibaba.fastjson.JSON;

import armou.cc.poi_excel.entity.ExcelDTO;
import armou.cc.poi_excel.util.ExcelUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<ExcelDTO> excelDemos = ExcelUtils.readExcel("C:\\Users\\67555\\Downloads\\excelTest.xlsx", ExcelDTO.class);
    	excelDemos.stream().distinct().forEach(b->System.out.println(JSON.toJSONString(b, true)));
    }
}
