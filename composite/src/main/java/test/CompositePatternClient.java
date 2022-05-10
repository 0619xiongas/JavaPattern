package test;

import bean.*;
public class CompositePatternClient {
    public static void main(String[] args) {
        OrganizationComponet beijing = new DeptComponet();
        beijing.setName("北京总部");
        OrganizationComponet jiaowuOffice1 = new Office();
        jiaowuOffice1.setName("教务办公室1");
        OrganizationComponet hunanfenxiao = new DeptComponet();
        hunanfenxiao.setName("湖南分校");
        OrganizationComponet xingzhengOffice = new Office();
        xingzhengOffice.setName("行政办公室1");
        OrganizationComponet jiaowuOffice2 = new Office();
        jiaowuOffice2.setName("教务办公室2");
        OrganizationComponet changshaJiaoxuediao = new DeptComponet();
        changshaJiaoxuediao.setName("长沙教学点");
        OrganizationComponet xiangtanjiaoxuedian = new DeptComponet();
        xiangtanjiaoxuedian.setName("湘潭教学点");
        OrganizationComponet xingzhengOffice2 = new Office();
        xingzhengOffice2.setName("行政办公室2");
        OrganizationComponet jiaowuOffice3 = new Office();
        jiaowuOffice3.setName("教务办公室3");
        OrganizationComponet xingzhengOffice3 = new Office();
        xingzhengOffice3.setName("行政办公室3");
        OrganizationComponet jiaowuOffice4 = new Office();
        jiaowuOffice4.setName("教务办公室4");
        OrganizationComponet xingzhengOffice4 = new Office();
        xingzhengOffice4.setName("行政办公室4");

        beijing.addComponet(jiaowuOffice1);
        beijing.addComponet(hunanfenxiao);
        beijing.addComponet(xingzhengOffice);
        hunanfenxiao.addComponet(jiaowuOffice2);
        hunanfenxiao.addComponet(changshaJiaoxuediao);
        hunanfenxiao.addComponet(xiangtanjiaoxuedian);
        hunanfenxiao.addComponet(xingzhengOffice2);
        changshaJiaoxuediao.addComponet(jiaowuOffice3);
        changshaJiaoxuediao.addComponet(xingzhengOffice3);
        xiangtanjiaoxuedian.addComponet(jiaowuOffice4);
        xiangtanjiaoxuedian.addComponet(xingzhengOffice4);

        beijing.sendMessage("北京总部发送公文");
        System.out.println("----------------------");
        xiangtanjiaoxuedian.sendMessage("发送公文");
    }
}
