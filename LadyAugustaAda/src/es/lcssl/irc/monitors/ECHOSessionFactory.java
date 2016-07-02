/**
 * 
 */
package es.lcssl.irc.monitors;

import es.lcssl.irc.protocol.Origin;
import es.lcssl.sessions.SessionFactory;
import es.lcssl.sessions.SessionManager;

/**
 * @author lcu
 *
 */
public class ECHOSessionFactory implements SessionFactory<Origin, ECHOSession> {

	@Override
	public ECHOSession newSession(SessionManager<ECHOSession> sessionManager,
			Origin sessionId) {
		return new ECHOSession();
	}

}
