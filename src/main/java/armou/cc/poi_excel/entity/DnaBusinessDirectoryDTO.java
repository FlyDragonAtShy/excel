package armou.cc.poi_excel.entity;

import armou.cc.poi_excel.annotation.ExcelColumn;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Administrator
 */
@Data
@Accessors(chain = true)
public class DnaBusinessDirectoryDTO {

    private static final long serialVersionUID = 8855038923108170600L;

    /**
     * 业务部门名称
     */
    @ExcelColumn(value="业务部门名称",col=1)
    private String busHandDepart;
    /**
     * 业务科室名称
     */
    @ExcelColumn(value="业务科室名称",col=2)
    private String busHandOffice;
    /**
     * 业务处室职责
     */
    @ExcelColumn(value="业务处室职责",col=3)
    private String functionalAreas;
    /**
     * 业务事项名称
     */
    @ExcelColumn(value="业务事项名称",col=4)
    private String busItemName;
    /**
     * 业务事项简述
     */
    @ExcelColumn(value="业务事项简述",col=5)
    private String busItemBrief;
    /**
     * 业务事项办理依据
     */
    @ExcelColumn(value="业务事项办理依据",col=6)
    private String busItemGist;
    /**
     * 业务事项所需材料
     */
    @ExcelColumn(value="业务事项所需材料",col=7)
    private String busMatters;
    /**
     * 业务事项产生材料
     */
    @ExcelColumn(value="业务部门名称",col=8)
    private String busMattProduce;
    /**
     * 所属系统名称
     */
    @ExcelColumn(value="所属系统名称",col=9)
    private String surveyId;
    /**
     * 数据资源
     */
    @ExcelColumn(value="数据资源",col=10)
    private String resId;
}
