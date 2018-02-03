package com.premps.configserver.config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Value("${spring.cloud.config.server.git.uri}")
	private String gitHubConfigRepo = "";

	@Test
	public void contextLoads() {

		assertTrue(true);

		try {
			URL u = new URL(gitHubConfigRepo);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			huc.setRequestMethod("GET");
			huc.connect();
			assertThat(huc.getResponseCode() != 404);
		} catch (MalformedURLException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

}
