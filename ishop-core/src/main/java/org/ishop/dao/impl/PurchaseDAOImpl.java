package org.ishop.dao.impl;

import org.ishop.dao.PurchaseDAO;
import org.ishop.domain.Purchase;
import org.jboss.annotation.ejb.LocalBinding;

import javax.ejb.Stateless;

/**
 * {@link PurchaseDAO} implementation
 *
 * @author Alexander Burchak
 */
@Stateless(name = "purchaseDAO")
@LocalBinding(jndiBinding = "purchaseDAOLocal")
public class PurchaseDAOImpl extends AbstractDAO<Purchase> implements PurchaseDAO {
    public PurchaseDAOImpl() {
        super(Purchase.class);
    }
}