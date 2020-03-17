package idv.king.urlencoding;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.util.UriUtils;

import java.nio.charset.StandardCharsets;

public class UrlencodingApplicationTests {


  private static String testUri = "http://user:!)&%@symphox.com.tw:8080/search/detail?a=1 aaa&b=2+!!#index3";
  private static String loginAWSUri = "https://cloud_user:KGGA4237ghji@kungyao1c.websh.mylabserver.com/";
  private static Logger logger = LoggerFactory.getLogger("EncodeTest");

  @Test
  void testEncode() {
    // Reference https://www.ietf.org/rfc/rfc3986.txt
    String encodeAuthorityResult = UriUtils.encodeAuthority(loginAWSUri, StandardCharsets.UTF_8);
    String encodeSchemeResult = UriUtils.encodeScheme(loginAWSUri, StandardCharsets.UTF_8);
    String encodeFragmentResult = UriUtils.encodeFragment(loginAWSUri, StandardCharsets.UTF_8);
    String encodeHostResult = UriUtils.encodeHost(loginAWSUri, StandardCharsets.UTF_8);
    String encodePathResult = UriUtils.encodePath(loginAWSUri, StandardCharsets.UTF_8);
    String encodePortResult = UriUtils.encodePort(loginAWSUri, StandardCharsets.UTF_8);
    String encodePathSegmentResult = UriUtils.encodePathSegment(loginAWSUri, StandardCharsets.UTF_8);
    String encodeQueryResult = UriUtils.encodeQuery(loginAWSUri, StandardCharsets.UTF_8);
    String encodeQueryParamResult = UriUtils.encodeQueryParam(loginAWSUri, StandardCharsets.UTF_8);
    String encodeUserInfoResult = UriUtils.encodeUserInfo(loginAWSUri,StandardCharsets.UTF_8);
    String encodeResult = UriUtils.encode(loginAWSUri,StandardCharsets.UTF_8);
    logger.info("source = {} ,authority encode = {}",loginAWSUri,encodeAuthorityResult);
    logger.info("source = {} ,scheme encode = {}",loginAWSUri,encodeSchemeResult);
    logger.info("source = {} ,fragment encode = {}",loginAWSUri,encodeFragmentResult);
    logger.info("source = {} ,host encode = {}",loginAWSUri,encodeHostResult);
    logger.info("source = {} ,path encode = {}",loginAWSUri,encodePathResult);
    logger.info("source = {} ,port encode = {}",loginAWSUri,encodePortResult);
    logger.info("source = {} ,pathSegment encode = {}",loginAWSUri,encodePathSegmentResult);
    logger.info("source = {} ,query encode = {}",loginAWSUri,encodeQueryResult);
    logger.info("source = {} ,query param encode = {}",loginAWSUri,encodeQueryParamResult);
    logger.info("source = {} ,userinfo  encode = {}",loginAWSUri,encodeUserInfoResult);
    logger.info("source = {} ,encode = {}",loginAWSUri,encodeResult);


  }

}
