package interfacesAndAbstractionEx.telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {
        StringBuilder output = new StringBuilder();
        for (String url : urls) {
            if (isValidUrl(url)) {
                output.append("Browsing: ").append(url).append("!\n");
            } else {
                output.append("Invalid URL!").append("\n");
            }
        }
        return output.toString();
    }

    private boolean isValidUrl(String url) {
        return !url.matches(".*\\d.*");
    }

    @Override
    public String call() {
        StringBuilder output = new StringBuilder();
        for (String number : numbers) {
            if (isValidNumber(number)) {
                output.append("Calling... ").append(number).append("\n");
            } else {
                output.append("Invalid number!").append("\n");
            }
        }
        return output.toString();
    }

    private boolean isValidNumber(String number) {
        return !number.matches(".*\\D.*");
    }
}
