//
<ol>
<li><a href="https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/List.html#slice(from:Int,until:Int):List[A]">scala.collection.immutable.List#slice</a></li>
<li name="scala.collection.immutable.List#slice" visbl="pub" class="indented0 " data-isabs="false" fullcomment="yes" group="Ungrouped"> <a id="slice(from:Int,until:Int):List[A]"></a><a id="slice(Int,Int):List[A]"></a> <span class="permalink"> <a href="../../../scala/collection/immutable/List.html#slice(from:Int,until:Int):List[A]" title="Permalink"> <i class="material-icons"></i> </a> </span> <span class="modifier_kind"> <span class="modifier"></span> <span class="kind">def</span> </span> <span class="symbol"> <span class="name">slice</span><span class="params">(<span name="from">from: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>, <span name="until">until: <a href="../../Int.html" class="extype" name="scala.Int">Int</a></span>)</span><span class="result">: <a href="" class="extype" name="scala.collection.immutable.List">List</a>[<span class="extype" name="scala.collection.immutable.List.A">A</span>]</span> </span> <p class="shortcomment cmt"></p>
 <div class="fullcomment">
  <div class="comment cmt"></div>
  <dl class="paramcmts block">
   <dt>
    returns
   </dt>
   <dd class="cmt">
    <p>a list containing the elements greater than or equal to index <code>from</code> extending up to (but not including) index <code>until</code> of this list.</p>
   </dd>
  </dl>
  <dl class="attributes block"> 
   <dt>
    Definition Classes
   </dt>
   <dd>
    <a href="" class="extype" name="scala.collection.immutable.List">List</a> → 
    <a href="../LinearSeqOptimized.html" class="extype" name="scala.collection.LinearSeqOptimized">LinearSeqOptimized</a> → 
    <a href="../IterableLike.html" class="extype" name="scala.collection.IterableLike">IterableLike</a> → 
    <a href="../TraversableLike.html" class="extype" name="scala.collection.TraversableLike">TraversableLike</a> → 
    <a href="../GenTraversableLike.html" class="extype" name="scala.collection.GenTraversableLike">GenTraversableLike</a>
   </dd>
   <div class="block">
    Example: 
    <ol>
     <li class="cmt"><p></p><pre><span class="cmt">// Given a list</span>
<span class="kw">val</span> letters = <span class="std">List</span>(<span class="lit">'a'</span>,<span class="lit">'b'</span>,<span class="lit">'c'</span>,<span class="lit">'d'</span>,<span class="lit">'e'</span>)

<span class="cmt">// `slice` returns all elements beginning at index `from` and afterwards,</span>
<span class="cmt">// up until index `until` (excluding index `until`.)</span>
letters.slice(<span class="num">1</span>,<span class="num">3</span>) <span class="cmt">// Returns List('b','c')</span></pre></li>
    </ol> 
   </div>
  </dl>
 </div> </li>
        </ol>


### Examples





























