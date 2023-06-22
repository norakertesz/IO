package Bespiel1FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {

    private ArrayList<Address> addressList;

    public AddressManager(ArrayList<Address> addressList) {
        this.addressList = new ArrayList<>();
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void add(Address a) {
        addressList.add(a);
    }


    public void printAllAddresses(){
        int i=0;
        System.out.println("ADDRESSES");
        for (Address a:addressList
             ) {
            System.out.println("Address" + i + " "+a);
        }
    }

    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportFileAlreadyExistsException {

        File file = new File(path);
        String message = "The file alredy exist";
        if (file.exists()) {
            throw new AddressExportFileAlreadyExistsException(message);
        }

        FileWriter fw = null;
        BufferedWriter buffer = null;
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            throw new AddressExportException(e.getMessage());
        }
        buffer = new BufferedWriter(fw);
        try {
            for (Address a : addressList) {

                buffer.write(a.toString());
                buffer.newLine();
            }
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            throw new AddressExportException(e.getMessage());
        }


    }


    public void loadFromCsv(String path, String separator) throws AddressLoadWrongFormatException, AddressLoadException {
        List<Address> addressList = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            FileReader fr = new FileReader(path);
            bufferedReader = new BufferedReader(fr);

            String temp;
            while (((temp = bufferedReader.readLine()) != null)) {
                String[] tempp = temp.split(separator);
                if (tempp.length != 4) {
                    throw new AddressLoadWrongFormatException("4 Spalten erwartet!");
                }
                addressList.add(new Address(tempp[0], tempp[1], tempp[2], tempp[3]));
            }
        } catch (IOException e) {
            throw new AddressLoadException(e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new AddressLoadException(e.getMessage());
            }
        }

    }


    @Override
    public String toString() {
        return "AddressManager{" +
                "addressList=" + addressList +
                '}';
    }
}


class AddressExportFileAlreadyExistsException extends Exception {
    public AddressExportFileAlreadyExistsException(String message) {
        super(message);
    }
}

class AddressExportException extends Exception {

    public AddressExportException(String message) {
        super(message);
    }
}

class AddressLoadException extends Exception {
    public AddressLoadException(String message) {
        super(message);
    }

}

class AddressLoadWrongFormatException extends Exception {
    public AddressLoadWrongFormatException(String message) {
        super(message);
    }

}