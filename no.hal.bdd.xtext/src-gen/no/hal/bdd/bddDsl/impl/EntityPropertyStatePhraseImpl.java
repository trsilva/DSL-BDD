/**
 * generated by Xtext 2.25.0
 */
package no.hal.bdd.bddDsl.impl;

import java.util.Collection;

import no.hal.bdd.bddDsl.BddDslPackage;
import no.hal.bdd.bddDsl.EntityPropertyStatePhrase;
import no.hal.bdd.bddDsl.EntityRef;
import no.hal.bdd.bddDsl.PropertyDef;
import no.hal.bdd.bddDsl.PropertyValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Property State Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.bdd.bddDsl.impl.EntityPropertyStatePhraseImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.EntityPropertyStatePhraseImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.EntityPropertyStatePhraseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.EntityPropertyStatePhraseImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityPropertyStatePhraseImpl extends StatePhraseImpl implements EntityPropertyStatePhrase
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected PropertyDef property;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected EntityRef entity;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected PropertyValue value;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<PropertyValue> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityPropertyStatePhraseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BddDslPackage.Literals.ENTITY_PROPERTY_STATE_PHRASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyDef getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (PropertyDef)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDef basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(PropertyDef newProperty)
  {
    PropertyDef oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityRef getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(EntityRef newEntity, NotificationChain msgs)
  {
    EntityRef oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntity(EntityRef newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY, newEntity, newEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(PropertyValue newValue, NotificationChain msgs)
  {
    PropertyValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(PropertyValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this, BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return basicSetEntity(null, msgs);
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        return basicSetValue(null, msgs);
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return getEntity();
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        return getValue();
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUES:
        return getValues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        setProperty((PropertyDef)newValue);
        return;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        setEntity((EntityRef)newValue);
        return;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        setValue((PropertyValue)newValue);
        return;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends PropertyValue>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        setProperty((PropertyDef)null);
        return;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        setEntity((EntityRef)null);
        return;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        setValue((PropertyValue)null);
        return;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUES:
        getValues().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        return property != null;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return entity != null;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        return value != null;
      case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntityPropertyStatePhraseImpl
