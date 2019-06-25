package com.perpule.plutuspay.printData;

import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("DataToPrint")
    private String DataToPrint;


    private String PrintDataType;
    private Integer PrinterWidth;
    private Boolean IsCenterAligned;

    private String ImagePath;
    private String ImageData;

    public Data(String printDataType, Integer printerWidth, Boolean isCenterAligned, String dataToPrint, String imagePath, String imageData) {

        PrintDataType = printDataType;
        PrinterWidth = printerWidth;
        IsCenterAligned = isCenterAligned;
        DataToPrint = dataToPrint;
        ImagePath = imagePath;
        ImageData = imageData;
    }

    public void setPrintDataType(String printDataType) {
        PrintDataType = printDataType;
    }

    public void setPrinterWidth(Integer printerWidth) {
        PrinterWidth = printerWidth;
    }

    public void setCenterAligned(Boolean centerAligned) {
        IsCenterAligned = centerAligned;
    }

    public void setDataToPrint(String dataToPrint) {
        DataToPrint = dataToPrint;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public void setImageData(String imageData) {
        ImageData = imageData;
    }


}
