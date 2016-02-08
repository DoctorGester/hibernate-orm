/**
 * 
 */
package org.hibernate.envers.query;

import org.hibernate.CacheMode;
import org.hibernate.FlushMode;
import org.hibernate.LockMode;
import org.hibernate.envers.query.criteria.AuditCriterion;
import org.hibernate.envers.query.order.AuditOrder;
import org.hibernate.envers.query.projection.AuditProjection;

/**
 * @author Felix Feisst (feisst dot felix at gmail dot com)
 */
public interface AuditAssociationQuery<Q extends AuditQuery> extends AuditQuery {

	@Override
	AuditAssociationQuery<Q> add(AuditCriterion criterion);

	@Override
	AuditAssociationQuery<Q> addOrder(AuditOrder order);

	@Override
	AuditAssociationQuery<Q> addProjection(AuditProjection projection);

	@Override
	AuditAssociationQuery<Q> setMaxResults(int maxResults);

	@Override
	AuditAssociationQuery<Q> setFirstResult(int firstResult);

	@Override
	AuditAssociationQuery<Q> setCacheable(boolean cacheable);

	@Override
	AuditAssociationQuery<Q> setCacheRegion(String cacheRegion);

	@Override
	AuditAssociationQuery<Q> setComment(String comment);

	@Override
	AuditAssociationQuery<Q> setFlushMode(FlushMode flushMode);

	@Override
	AuditAssociationQuery<Q> setCacheMode(CacheMode cacheMode);

	@Override
	AuditAssociationQuery<Q> setTimeout(int timeout);

	@Override
	AuditAssociationQuery<Q> setLockMode(LockMode lockMode);

	Q up();

}