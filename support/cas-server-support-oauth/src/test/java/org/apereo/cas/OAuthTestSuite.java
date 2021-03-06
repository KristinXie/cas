package org.apereo.cas;

import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.support.oauth.services.OAuthWebApplicationServiceTests;
import org.apereo.cas.support.oauth.web.OAuth20AccessTokenControllerMemcachedTests;
import org.apereo.cas.support.oauth.web.OAuth20AccessTokenControllerTests;
import org.apereo.cas.support.oauth.web.OAuth20AuthorizeControllerTests;
import org.apereo.cas.support.oauth.web.OAuth20ProfileControllerTests;
import org.apereo.cas.ticket.accesstoken.OAuthAccessTokenExpirationPolicyTests;
import org.apereo.cas.ticket.accesstoken.OAuthAccessTokenSovereignExpirationPolicyTests;
import org.apereo.cas.ticket.refreshtoken.OAuthRefreshTokenExpirationPolicyTests;
import org.apereo.cas.ticket.refreshtoken.OAuthRefreshTokenSovereignExpirationPolicyTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * OAuth test suite that runs all test in a batch.
 *
 * @author Misagh Moayyed
 * @since 4.0.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    OAuth20AccessTokenControllerTests.class,
    OAuth20AuthorizeControllerTests.class,
    OAuthAccessTokenExpirationPolicyTests.class,
    OAuthAccessTokenSovereignExpirationPolicyTests.class,
    OAuthRefreshTokenExpirationPolicyTests.class,
    OAuthRefreshTokenSovereignExpirationPolicyTests.class,
    OAuth20AccessTokenControllerMemcachedTests.class,
    OAuth20ProfileControllerTests.class,
    OAuthWebApplicationServiceTests.class
})
@Slf4j
public class OAuthTestSuite {
}
