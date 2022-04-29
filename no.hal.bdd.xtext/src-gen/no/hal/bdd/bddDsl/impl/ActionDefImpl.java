/**
 * generated by Xtext 2.25.0
 */
package no.hal.bdd.bddDsl.impl;

import no.hal.bdd.bddDsl.ActionDef;
import no.hal.bdd.bddDsl.BddDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.bdd.bddDsl.impl.ActionDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.ActionDefImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.ActionDefImpl#getPreposition <em>Preposition</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.impl.ActionDefImpl#isOptionalPref <em>Optional Pref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDefImpl extends MinimalEObjectImpl.Container implements ActionDef
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getArgument() <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected static final String ARGUMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected String argument = ARGUMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getPreposition() <em>Preposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreposition()
   * @generated
   * @ordered
   */
  protected static final String PREPOSITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreposition() <em>Preposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreposition()
   * @generated
   * @ordered
   */
  protected String preposition = PREPOSITION_EDEFAULT;

  /**
   * The default value of the '{@link #isOptionalPref() <em>Optional Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptionalPref()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_PREF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptionalPref() <em>Optional Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptionalPref()
   * @generated
   * @ordered
   */
  protected boolean optionalPref = OPTIONAL_PREF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionDefImpl()
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
    return BddDslPackage.Literals.ACTION_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.ACTION_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArgument(String newArgument)
  {
    String oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.ACTION_DEF__ARGUMENT, oldArgument, argument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPreposition()
  {
    return preposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPreposition(String newPreposition)
  {
    String oldPreposition = preposition;
    preposition = newPreposition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.ACTION_DEF__PREPOSITION, oldPreposition, preposition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isOptionalPref()
  {
    return optionalPref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOptionalPref(boolean newOptionalPref)
  {
    boolean oldOptionalPref = optionalPref;
    optionalPref = newOptionalPref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.ACTION_DEF__OPTIONAL_PREF, oldOptionalPref, optionalPref));
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
      case BddDslPackage.ACTION_DEF__NAME:
        return getName();
      case BddDslPackage.ACTION_DEF__ARGUMENT:
        return getArgument();
      case BddDslPackage.ACTION_DEF__PREPOSITION:
        return getPreposition();
      case BddDslPackage.ACTION_DEF__OPTIONAL_PREF:
        return isOptionalPref();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BddDslPackage.ACTION_DEF__NAME:
        setName((String)newValue);
        return;
      case BddDslPackage.ACTION_DEF__ARGUMENT:
        setArgument((String)newValue);
        return;
      case BddDslPackage.ACTION_DEF__PREPOSITION:
        setPreposition((String)newValue);
        return;
      case BddDslPackage.ACTION_DEF__OPTIONAL_PREF:
        setOptionalPref((Boolean)newValue);
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
      case BddDslPackage.ACTION_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BddDslPackage.ACTION_DEF__ARGUMENT:
        setArgument(ARGUMENT_EDEFAULT);
        return;
      case BddDslPackage.ACTION_DEF__PREPOSITION:
        setPreposition(PREPOSITION_EDEFAULT);
        return;
      case BddDslPackage.ACTION_DEF__OPTIONAL_PREF:
        setOptionalPref(OPTIONAL_PREF_EDEFAULT);
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
      case BddDslPackage.ACTION_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BddDslPackage.ACTION_DEF__ARGUMENT:
        return ARGUMENT_EDEFAULT == null ? argument != null : !ARGUMENT_EDEFAULT.equals(argument);
      case BddDslPackage.ACTION_DEF__PREPOSITION:
        return PREPOSITION_EDEFAULT == null ? preposition != null : !PREPOSITION_EDEFAULT.equals(preposition);
      case BddDslPackage.ACTION_DEF__OPTIONAL_PREF:
        return optionalPref != OPTIONAL_PREF_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", argument: ");
    result.append(argument);
    result.append(", preposition: ");
    result.append(preposition);
    result.append(", optionalPref: ");
    result.append(optionalPref);
    result.append(')');
    return result.toString();
  }

} //ActionDefImpl
