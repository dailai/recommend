package com.xiaomi.recommend.engine.utils;



import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.xiaomi.recommend.engine.domain.Product;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 代来
 * @create 2018/11/11
 * @description
 */
@Component
public class XMProduct {

    @Value("${youpin.mi.com.url}")
    private String url;

    public List<Product> getProduct() {
        List<Product> list = getProductsByUrl(url);
        return list;
    }

    private List<Product> getProductsByUrl(String url) {

        ArrayList<Product> list = new ArrayList<>();
        try {
            String driverLoc = "D:\\recommend\\recommend-engine\\src\\main\\resources\\driver\\chromedriver.exe";
            String driver = "webdriver.chrome.driver";
            System.setProperty(driver, driverLoc);

            WebDriver webdriver = new ChromeDriver();
            webdriver.get("https://youpin.mi.com/goodsbycategory?firstId=579&secondId=579");
            Document document = Jsoup.parse(webdriver.getPageSource());
            System.out.println(document.getElementsByClass("typeGoods-item"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
