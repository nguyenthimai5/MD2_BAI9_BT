package BT2;

public class TriangleClassifier {
    public String getTriangle(String currurentTriangle){
        String[] arrListTriangle=currurentTriangle.split("_");
        int sideA=Integer.parseInt(arrListTriangle[0]);
        int sideB=Integer.parseInt(arrListTriangle[1]);
        int sideC=Integer.parseInt(arrListTriangle[2]);
        String triangleList="";
        if (sideA>0&&sideB>0&&sideC>0&&sideA+sideB>sideC&&sideA+sideC>sideB&&sideB+sideC>sideA){
            if (sideA==sideB&&sideB==sideC){
                triangleList="Đây là tam giác đều";
            } else if (sideA==sideB||sideA==sideC||sideC==sideB) {
                triangleList="Đây là tam giác cân";

            } else{
                triangleList="Đây là tam giác thường";
            }
        }else {
            triangleList="Đây không phải tam giác";

        }
       return triangleList;
    }
}
