package org.omg.CosNaming;


/**
* org/omg/CosNaming/Binding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u191/11896/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Saturday, October 6, 2018 8:38:58 AM PDT
*/

public final class Binding implements org.omg.CORBA.portable.IDLEntity
{
  public NameComponent binding_name[] = null;

  // name
  public BindingType binding_type = null;

  public Binding ()
  {
  } // ctor

  public Binding (NameComponent[] _binding_name, BindingType _binding_type)
  {
    binding_name = _binding_name;
    binding_type = _binding_type;
  } // ctor

} // class Binding