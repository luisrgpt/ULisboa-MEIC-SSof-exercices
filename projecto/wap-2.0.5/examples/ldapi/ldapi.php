<?php

$user = $_POST["user"];
$password = $_POST["pass"];
$host = 'myldap';
$domain = 'mydomain.ex';
$basedn = 'dc=mydomain,dc=ex';
$group = 'SomeGroup';

$ad = ldap_connect("ldap://{$host}.{$domain}");
$filter = "(& (user=".$user.")(password=".$password."))";
$result = ldap_search($ad, $domain, $_POST["user"]);
$result = ldap_search($ad, $domain, $filter);
?>
