package org.pac4j.demo.spring.authorizer;

import org.pac4j.core.authorization.Authorizer;
import org.pac4j.core.context.WebContext;
import org.pac4j.core.profile.UserProfile;

public class XFrameOptionsAuthorizer  implements Authorizer {

    public boolean isAuthorized(WebContext context, UserProfile profile) {
        context.setResponseHeader("X-Frame-Options", "DENY");
        return true;
    }
}
