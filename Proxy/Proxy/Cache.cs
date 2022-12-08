using System;
using System.Runtime.Caching;

namespace Proxy
{
    internal class Cache<T> where T : class
    {
        ObjectCache cache = MemoryCache.Default;
        DateTimeOffset dt_default = ObjectCache.InfiniteAbsoluteExpiration;

        //Pour ajouter au cache la liste des contrats, la liste des stations et les stations sans durée déterminée
        public T Get(string CacheItem)
        {
            T obj = (T)cache.Get(CacheItem);
            if (obj != null)
                return obj;
            T newObj = (T)Activator.CreateInstance(typeof(T), CacheItem);
            cache.Add(CacheItem, newObj, dt_default);
            return newObj;
        }

        //Pour ajouter au cache les informations sur une station avec une durée déterminée de 60s
        public T Get(string CacheItem, double dt_seconds)
        {
            T obj = (T)cache.Get(CacheItem);
            if (obj != null)
                return obj;
            T newObj = (T)Activator.CreateInstance(typeof(T), CacheItem);
            DateTimeOffset seconds = new DateTimeOffset();
            seconds.AddSeconds(dt_seconds);
            cache.Add(CacheItem, newObj, seconds);
            return newObj;
        }
       
    }
}
