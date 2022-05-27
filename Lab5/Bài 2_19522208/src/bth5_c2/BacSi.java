/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth5_c2;

/**
 *
 * @author 84346
 */
public class BacSi {
    public String MaBS;
    public String TenBS;

    public BacSi() {
    }

    public BacSi(String MaBS, String TenBS) {
        this.MaBS = MaBS;
        this.TenBS = TenBS;
    }

    public String getMaBS() {
        return MaBS;
    }

    public void setMaBS(String MaBS) {
        this.MaBS = MaBS;
    }

    public String getTenBS() {
        return TenBS;
    }

    public void setTenBS(String TenBS) {
        this.TenBS = TenBS;
    }
    
    /**
     *
     */
    @Override
    public String toString()
    {
        return TenBS;
    }
}
