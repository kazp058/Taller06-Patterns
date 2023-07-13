/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author melan
 */
public class Reporte {
    BuilderReporte builderReporte;

    public Reporte(BuilderReporte builderReporte) {
        this.builderReporte = builderReporte;
    }
    public Reporte(){}
public void construirReporte() {
        builderReporte.buildReportA();
        builderReporte.buildReportB();
    }
}
