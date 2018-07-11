
package br.denis.bolao.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class PartidaBean {
    
    private String time_1;
    private String time_2;
    private String result_1;
    private String result_2;


    public String getTime_1() {
        return time_1;
    }

    public void setTime_1(String time_1) {
        this.time_1 = time_1;
    }

    public String getTime_2() {
        return time_2;
    }

    public void setTime_2(String time_2) {
        this.time_2 = time_2;
    }
    
    public String getResult_1() {
        return result_1;
    }

    public void setResult_1(String result_1) {
        this.result_1 = result_1;
    }

    public String getResult_2() {
        return result_2;
    }

    public void setResult_2(String result_2) {
        this.result_2 = result_2;
    }
       
}
