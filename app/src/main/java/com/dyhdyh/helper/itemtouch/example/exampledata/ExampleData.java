package com.dyhdyh.helper.itemtouch.example.exampledata;

import java.util.Arrays;
import java.util.List;

/**
 * @author dengyuhan
 *         created 2018/4/8 14:47
 */
public class ExampleData {
    private String cover;
    private String file;

    public static List<ExampleData> create() {
        ExampleData[] array = new ExampleData[]{new ExampleData("http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM7a38SyvibMdKmy3iaCuYN2D5KcibAg4vd2yjsM4YNc9PXj2mmBql4PKZo/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLDPE4aaDRRPQFNXh4QeP98sYnD94JgsbSYNY8WWGuEwspjbVOkumoVE/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCmxPqI7fND1u66qqFpsoh1ZKWhuKStgBh0vtGKWoOATns1jtzaWicxD/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCmxPqI7fND1vb0lUe4N1jWRSoblQuibVCrIFMQPzQozR0ZzMYgS43Wp/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM77fkVv3h31dbpFd4awutSbf8886qcUrvSms6qnoEPUskDWHcDvXAqE/0", "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM77fkVv3h31daKuEVVibtHzLyAHia41dmLTtmQUG3sUEP9L04ia7nbkFP0/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM4CztgJabQibWic3wh7OwnTGtLZxLVoWGibb3beBQYnnIv6COIK3o2zRrp/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLDOlsGtttOfyC252oezpmGRbsccdXpSy5s72pA6ZjcOb2MlTXAJAkV7/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLAszSAQ4gJlhxTEIEvozy84ichaVSEUsdvNEqplvrpMSuIujXjd4ITUK/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLAszSAQ4gJlh31MpvkJsSTibSacK9TuvcibcjBPab31zCpuhuicLgicE37q/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM7dFHfr7icWeptaGibf8YYYtZlRNJ552xCFO8SOD3daG2IcxCauH4OBoh/0", "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM7dFHfr7icWepvyr4z9y4VKwVa8zRib46uuuHQly8lZb3Y5VtT6UQBkn8/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLBVWrxFJdiaibziamAcz90FXMEJaZDJqKoTsA9tqhxod9Y2Miciby756CepU/0", "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM7B8OOkp5LFWTToz5k7Ka1OksXNfbHAwV9iblegzxh5LJFp7Xhhy4eu5/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM59iamsj3Ciaial8C23icFex1nCKiaqLrT0BW7fHQANvpJV8ceyge18yRJQg/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLA8JYkwicuPa1NNrLkVOPPK43aRib4K5rb4PHEr9ALuiaOjyjMwPsupUJk/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLA5Maia2pqHavQuI0tnrA2lsZ947BAhOK0E3zeQ2yq85vPD2oQIpGWdW/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLA5Maia2pqHavVp139hiaiaCLia3pNHg5y9qENcqluoYgQiaIEP1IpDLic408/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLDmvO21MHeS1RxFMZuNAYxlwVnEVHgNJGHWPV6PDCNm8iczGpzEr7XJR/0", "http://mmbiz.qpic.cn/mmemoticon/DhduwiaBa7le1zztatj9ice6RUKa9C7icHl1ZLqHJTwBI4sZI5k6ydAlw/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCSGzU8cqeRmKCmRd2YdQibTmoLB0wu4PDibYBqCTwnk1jyusn5wfacGh/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCSGzU8cqeRmIJqbnkiaf6WKcSiadic4PMW1nEiaHlUp0Fden26D8F0SLjL/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLAhXBBjIqSl2S8ia0ajm0zl2gcf95fU8adPtSckibPJmN5Sh6knz5EZaS/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLAhXBBjIqSl2QmU3ennibvqPyYeU6XH1xSuZiandr6maC92csllQg1BZc/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLA0S5KxD3YJjY6JFleEicgC3t3odB1RbrpFiaWcxHRiahCe4UlMWOrgkc9/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLA0S5KxD3YJjR8LTwEeHF26ZopvoJyHL6uMuarYMPmyA10qvoO2VKaz/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCdwOLyl7c6JMPmicicf2xGIsF3PKWpM3wvebwFvoUj7NagKiaOTHHsibpG/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCdwOLyl7c6JEDC08hap3R3ZHZQicDpe1ibfncL9k9zNZ0d3XLciaBOno5/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCekdibhG6xrkeytaXZibTrmMx5ibZAv50npjH1RXUpZqWGU1URVF398q8/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCekdibhG6xrkYic3tw7SXOd3GuuIuKgicvKZZIPWZWcH7jzQCNbuPSic8O/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLDNuP3ULtMbekIPR3riacP9JIPSRha22meDcuwpnfIY77O9yvhNqHjx0/0", "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM7lf1vRwFDtwPpbaCqXpgJiaD8dnxzia4B6z4dpQY2rrYwNEmfVBVfPE6/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM7ODaqSxITnwia8o7lP5r42x9gPtA7FQe7fzWTl70zf0wzknic5p7JEZ4/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLA4XqclcticIpLD7Iic8esgaJVBmKfBfLAaib51Tqq63cnt5t1nu6JvE2b/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLBpI7y0C4mp9oG8CrgeZ4gXDrKwfouOCCbHcSUOw2B11fPFRLiaFzE9A/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLBpI7y0C4mp9vQ5bZB9xzHIMUbshfBKvbe5TPjbxL5ueHYqOhUOp7MW/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM5guAKrqOtGXibPiaibZ5tic9LFI01oLtScWibAKTDPGPibBbaszVZGgT0vwI/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLCDicxCiafP2KptliaPyj5miacUxF5iaJWNmjsPSeNFmjXxxmaApAhrYQg5P/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLC3ib2qk5SSCGHvLGNMXKmE7QOiaYEt83ibH8JF7Y3p6eCERFqVA34YyWB/0", "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM6n8rbxOAOExDkibpHhntlIicnBjDyA6A0eggwpqCphHk65IibJcDI9M5N/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLAWgbExnXhiceI6IZQRv6icdh7jqOT824wB5cvNoRs0Tb7qiaBkUyTbia6X/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLAWgbExnXhiceNIXyLAtULyqaQJOhNk0WXuKo1xD8b6Zuic3gkhicDTiaiah/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLAqn9uGg0riawbM4q7XPyS9gkuibARj6qT8yDzEddiaBRkgBXbjM7hhwjX/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLAqn9uGg0riawZvib9LvhFrzPl2H2eTPGOJendc2DW8wu2sgBeJJQv6icv/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM5GInBY3yWKjyqYzj1fkiaO5GNPmDIFfwKo3HLpITtYB8UIwX5o3J4dL/0", "http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLDSKTMRgM8agtDAiaIbp4jKJGibn4VGxrPgzxsDqa2cyBPXflP6uh5chd/0"),
                new ExampleData("http://mmbiz.qpic.cn/mmemoticon/ajNVdqHZLLACNZkcWvHBNdBXecXVOmiaePnW8gycRicUbsDlVoKTKInXfShoQA2sTJ/0", "http://mmbiz.qpic.cn/mmemoticon/Q3auHgzwzM6xv5afsBmPyGohttEeNHDQIH3j5RQkz0wbUtpdwYVfwJyuoPEdzkAg/0"),
        };

        return Arrays.asList(array);
    }

    public ExampleData(String cover, String file) {
        this.cover = cover;
        this.file = file;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
