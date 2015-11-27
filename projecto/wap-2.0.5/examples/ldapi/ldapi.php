<?php

$user = $_POST["user"];
$password = $_POST["pass"];
$host = 'myldap';
$domain = 'mydomain.ex';
$basedn = 'dc=mydomain,dc=ex';
$group = 'SomeGroup';

$ad = ldap_connect("ldap://{$host}.{$domain}");
ldap_set_option($ds, LDAP_OPT_PROTOCOL_VERSION, 3);

//Do a bind without sanitizing (Not really a vulnerability unless the password is empty and the server authentication is misconfigured)
$ldapbind = ldap_bind($ad, $user, $password);

//do a search without sanitizing
$filter = "(& (user=".$user.")(password=".$password."))";
$result = ldap_search($ad, $domain, $filter);

//do a search with sanitizing
$filter = "(& (user=".ldap_escape($user).")(password=".ldap_escape($password)."))";
$result = ldap_search($ad, $domain, $filter);
?>
