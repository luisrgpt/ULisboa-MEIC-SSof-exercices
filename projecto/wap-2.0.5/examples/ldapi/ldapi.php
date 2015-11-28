<?php
$user = $_POST["user"];
$password = $_POST["pass"];
$host = 'myldap';
$domain = 'mydomain.ex';
$basedn = 'dc=mydomain,dc=ex';
$group = 'SomeGroup';

$ad = ldap_connect("ldap://{$host}.{$domain}");
ldap_set_option($ds, LDAP_OPT_PROTOCOL_VERSION, 3);

//Do a bind without sanitizing 
$ldapbind = ldap_bind($ad, $user, $password);

//do a search without sanitizing
$tainted_filter = "(& (user=".$user.")(password=".$password."))";
$result = ldap_search($ad, $domain, $tainted_filter);

//do a search with sanitizing
$escaped_filter = "(& (user=".ldap_escape($user).")(password=".ldap_escape($password)."))";
$result = ldap_search($ad, $domain, $escaped_filter);

//Create an alias for the escaped filter and set it to an unsanitized value
$filter_alias =& $escaped_filter;
$filter_alias = $tainted_filter;
$result = ldap_search($ad, $domain, $escaped_filter); //This is a vulnerability that goes undetected!!

//Use a tainted variable from an include
include 'orfilter.php';
$result = ldap_search($ad, $domain, $orfilter);//This is a vulnerability that goes undetected!!

?>
