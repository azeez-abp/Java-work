package design_pattern.srtuctural.decorator.concrete;

import design_pattern.srtuctural.decorator.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;
     //implementation and composition;
    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
