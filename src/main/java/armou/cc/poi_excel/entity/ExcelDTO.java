package armou.cc.poi_excel.entity;

import java.io.Serializable;

import armou.cc.poi_excel.annotation.ExcelColumn;
import lombok.Data;

@Data
public class ExcelDTO implements Serializable {
	

	private static final long serialVersionUID = 8855038923108170600L;

	@ExcelColumn(value="中文名称",col=1)
	private String nameCn;
	
	@ExcelColumn(value="英文名称",col=2)
	private String nameEn;
	
	

}
